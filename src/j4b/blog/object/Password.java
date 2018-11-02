package j4b.blog.object;

public interface Password {
	
	void setPassword(String password);
	
	String getPassword();
	
	default String getDefaultPassword() {
		return "heslo";
	}

}
