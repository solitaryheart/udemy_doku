package excep;

public class Finallyy {

	public static void main(String[] args) {
		

		System.out.println("Program starting ...");
		
		try {
			
			int num = 6/3;
			
			System.out.println("The line is executed succesfully");
			
		} catch (ArrayIndexOutOfBoundsException e) {

			e.printStackTrace();
			
		} 
		
		finally {
			
			System.out.println("I am inside finally block");
		}
		
		System.out.println("Program ended successfully");
		
		
	}

}
