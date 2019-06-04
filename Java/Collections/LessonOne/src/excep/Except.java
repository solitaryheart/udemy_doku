package excep;

public class Except {
	 int a = 9;
	

	public static void main(String[] args) {
		
		System.out.println(" Program starts here .......");
		
		int array[] = new int[2];
		
		System.out.println("Calculation starts");
		
		try {
			array[1] = 12/0;
			
		} catch (ArithmeticException e) {
			
			System.out.println("I am inside arthimetic exception");
			
		} catch(Exception e) {
			
			System.out.println("I am inside generic exception");
		}
		
		System.out.println("Program Ends");
		
		

	}

}
