package j4b.blog.object;

import java.time.LocalDateTime;

public class User extends Person implements Password {

	private String userName;
	private String password;
	private LocalDateTime creationDate;
	
	
	public User(int id, String fullName) {
		super(id, fullName);
		this.password = getDefaultPassword();		
	}
	
	public User(int id, String fullName, String userName) {
		this(id, fullName);
		this.userName = userName;		
		this.creationDate = LocalDateTime.now();
	}
	
	public User(int id, String fullName, String userName, LocalDateTime creationDate) {
		this(id, fullName, userName);		
		this.creationDate = creationDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}
	
	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [" + userName + ", " + creationDate.getYear() + "-"+ creationDate.getMonthValue() + "-"+ creationDate.getDayOfMonth() +"]";
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null)
			return false;

		if (!(obj instanceof User))
			return false;

		if (obj == this)
			return true;

		return this.getUserName() == ((User) obj).getUserName();

	}
	
	@Override
	public int hashCode() {
	    return getId();
	}

}
