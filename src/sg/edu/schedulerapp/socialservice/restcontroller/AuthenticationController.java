package sg.edu.schedulerapp.socialservice.restcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import sg.edu.schedulerapp.socialservice.DTO.User;
import sg.edu.schedulerapp.socialservice.service.AuthenticationService;

@Path("/authentication")
public class AuthenticationController {

	@Context
	private UriInfo uriInfo;
	@Context
	private Request request;
	@Context 
	HttpServletRequest httpRequest;  
	
	private AuthenticationService authenticationService= new AuthenticationService();

	// http://localhost:8080/SchedulerAppSocialService/rest/socialservice/authentication/login?username=*&pwd=*
	@Path("/login")
	@GET
	@Produces( MediaType.APPLICATION_JSON ) // MediaType.TEXT_PLAIN
	public String authenticateLogin(@QueryParam("username") String username,
			@QueryParam("pwd") String password) {
		System.out.println("username: " + username);
		System.out.println("password: " + password);
		System.out.println("--- authenticate ---");
		User user = authenticationService.authenticate(username, password);
		if(user != null) {
			HttpSession httpSession = httpRequest.getSession();
			httpSession.setAttribute(RestControllerConstant.USER_SESSION_NAME, user);
			return httpSession.getId();
		} else {
			return RestControllerConstant.MSG_FAIL;
		}
	}
	
	// http://localhost:8080/SchedulerAppSocialService/rest/socialservice/authentication/logout
	@Path("/logout")
	@GET
	@Produces( MediaType.APPLICATION_JSON )
	public String authenticateLogout() {
		HttpSession httpSession = httpRequest.getSession();
		httpSession.invalidate();
		return RestControllerConstant.MSG_SUCCESS;
	}

}
