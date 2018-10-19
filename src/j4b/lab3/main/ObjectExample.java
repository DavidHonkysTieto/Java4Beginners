package j4b.lab3.main;

import j4b.lab3.object.Lamp;

public class ObjectExample {

	public static void main(String[] args) {

		Lamp l1 = new Lamp(), l2 = new Lamp();

		l1.turnOn();
		l2.turnOff();

		l1.displayLightStatus();
		l2.displayLightStatus();

	}

}
