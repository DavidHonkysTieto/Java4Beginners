package j4b.lab3.main;

import j4b.lab3.object.Company;

public class OverloadingConstructorExample {

	public static void main(String[] args) {
		Company defaultObj = new Company();
		Company programizObj = new Company("programiz.com");

		defaultObj.getName();
		programizObj.getName();
	}

}
