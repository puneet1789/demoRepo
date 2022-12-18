package abs;

public interface Login {

	public abstract String initiateLogin();
	
	default void LoginWithSteps() {
		
	}
	
	static void LoginWithNextSteps() {
		
	}
}
