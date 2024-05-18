package encapsulation;

public class User {

	private int userId;
	private String userName;
	private String password;

	User(int id, String name, String password) {

		this.userId = id;
		this.userName = name;
		this.password = password;

	}

	User(int id, String name) {

		this.userId = id;
		this.userName = name;

	}

	User(String userName, String password) {

		this.userName = userName;
		this.password = password;

	}

	User() {
	}

	// accessor or getter for userId
	public int getUserId() {
		return userId;
	}

	// Mutator or setter methods
	public void setUserId(int userId) {
		this.userId = userId;

	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public String toString() {
		return "UserId: " + userId + " Username:" + userName + " Password: " + password;
	}

}
