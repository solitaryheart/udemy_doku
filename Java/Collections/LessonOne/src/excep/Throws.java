package excep;

public class Throws {
	
	int donation;
	
	static void donate(int donation) throws Exception {
		if(donation<1) {
		
				throw new Exception("Less than 1$");
			
		}else {
			System.out.println("Thanks for the donation");
		}
	}
	
	

	public static void main(String[] args)  {
		try {
			Throws.donate(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Please donate more than 1$");
		}
		System.out.println("Program terminated");
		
		
	}

}
