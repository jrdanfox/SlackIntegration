package integration;

public class User {
	
	private String userName;
	private String userID;
	
	public User(String userName, String userID) {
		this.userName = userName;
		this.userID = userID;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public String getUserID() {
		return this.userID;
	}
}
