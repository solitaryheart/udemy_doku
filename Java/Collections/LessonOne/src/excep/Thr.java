package excep;

public class Thr {
	
	static void donate(int donate) throws Exception{
		if(donate<2) {
			
				throw new Exception("Less than 2 dollar");
				
		
		}else {
		
				System.out.println("Donation accepted succesfully");
		}
	}
	
	public static void main(String args[]) throws Exception {
		Thr.donate(1);
	}
	

}
