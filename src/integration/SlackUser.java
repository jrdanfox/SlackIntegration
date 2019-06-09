package integration;

public class SlackUser extends User {

	private String team_id;
	private boolean deleted;
	private String real_name;
	private String[] profile;
	private boolean is_admin;
	private boolean is_owner;
	private boolean is_bot;
	private int updated;
	
	public SlackUser(String userName, String userID) {
		super(userName, userID);
	}
	
}
