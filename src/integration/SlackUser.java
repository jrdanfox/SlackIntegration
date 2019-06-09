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
	
	public SlackUser(String userName, String userID, String team_id, boolean deleted,
			String real_name, String[] profile, boolean is_admin, boolean is_owner,
			boolean is_bot, int updated) {
		super(userName, userID);
		this.team_id = team_id;
		this.deleted = deleted;
		this.real_name = real_name;
		this.profile = profile;
		this.is_admin = is_admin;
		this.is_owner = is_owner;
		this.is_bot = is_bot;
		this.updated = updated;
	}
	
	public String getTeam_id() {
		return team_id;
	}

	public boolean getDeleted() {
		return deleted;
	}
	
	public String getReal_name() {
		return real_name;
	}
	
	public  String[] getProfile() {
		return profile;
	}
	
	public boolean getIs_admin() {
		return  is_admin;
	}
	
	public boolean getIs_owner() {
		return is_owner;
	}
	
	public boolean getIs_bot() {
		return is_bot;
	}
	
	public int getUpdated()  {
		return updated;
	}
	
}
