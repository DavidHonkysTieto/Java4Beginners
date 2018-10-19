package j4b.lab3.object;

public class Company {

	private String domainName;

	public Company() {
		this.domainName = "default";
	}

	public Company(String domainName) {
		this.domainName = domainName;
	}

	public void getName() {
		System.out.println(this.domainName);
	}

}
