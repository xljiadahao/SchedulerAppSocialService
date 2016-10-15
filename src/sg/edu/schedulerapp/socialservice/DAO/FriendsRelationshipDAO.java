package sg.edu.schedulerapp.socialservice.DAO;

import java.util.List;

import sg.edu.schedulerapp.socialservice.DTO.FriendRequestBuffer;

public interface FriendsRelationshipDAO {

	public void storeFriendRequestData(FriendRequestBuffer friendRequestBuffer) throws Exception;
	public boolean checkAlreadyBuffered(FriendRequestBuffer friendRequestBuffer) throws Exception;
	public boolean checkAlreadyBuffered(String sendRequestUserEmail, String receiveRequestUserEmail) throws Exception;
	public List<String> getReceivedReqEmails(String email) throws Exception;
	public List<String> getSentReqEmails(String email) throws Exception;
	public void clearBufferAndStoreRelationship(String myEmail, String requestEmail) throws Exception;
	public void clearBuffer(String myEmail, String requestEmail) throws Exception;
	public void delete(String myEmail, String requestEmail) throws Exception;
	
}
