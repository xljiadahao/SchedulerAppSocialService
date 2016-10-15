package sg.edu.schedulerapp.socialservice.DAO;

import java.util.List;
import java.util.Set;

import sg.edu.schedulerapp.socialservice.DTO.User;
import sg.edu.schedulerapp.socialservice.DTO.UserLastRequestResult;

public interface SocialSuggestionDAO {

	public void updateLastRequestResult(User user, Set<UserLastRequestResult> listUserLastRequestResult) throws Exception;
	public List<UserLastRequestResult> getFriendsTasksWithTimeConstraint(User user) throws Exception;
	
}
