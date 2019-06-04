package abs;

public abstract class Animal {

	int eyes = 2;
	int legs = 4;
	String sound;
	
	public void legs() {
		System.out.println("Animal have legs " + legs);
	}
	
	 abstract public void sound(); // abstract method
}
