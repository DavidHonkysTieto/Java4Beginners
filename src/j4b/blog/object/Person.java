package j4b.blog.object;

public class Person {
	
	private int id;
	private String fullName;

	public Person(int id, String fullName) {
		super();
		this.id = id;
		this.fullName = fullName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [" + fullName + "]";
	}	

}
