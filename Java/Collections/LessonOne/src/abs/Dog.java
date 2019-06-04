package abs;

public class Dog extends Animal{
	

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.legs();
		
	}

	@Override
	public void sound() {
		
		System.out.println("Dog barks");
	}

}
