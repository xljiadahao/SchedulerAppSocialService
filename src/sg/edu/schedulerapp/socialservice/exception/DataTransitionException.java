package sg.edu.schedulerapp.socialservice.exception;

public class DataTransitionException extends Exception {

	private static final long serialVersionUID = -9218151741894752851L;
	
	public DataTransitionException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public DataTransitionException(String message){
		super(message);
	}

}
