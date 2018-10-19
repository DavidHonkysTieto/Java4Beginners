package j4b.lab3.object;

/**
 * Lamp object
 */
public class Lamp {

	private boolean isOn;

	public void turnOn() {
		isOn = true;
	}

	public void turnOff() {
		isOn = false;
	}

	public void displayLightStatus() {
		System.out.println("Light on? " + isOn);
	}

}
