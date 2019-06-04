package pack;

public class HumanBeing extends LivingBeing {
		
	
	 public String legs = "4 legs";
	 public void run() { 
		 // over-ridden class
			System.out.println("I use 2 legs only, Overriding method");
			
		}
	 
	 public void demo() {
		 //super.run();
		 System.out.println(super.legs);
		 
	 }
	
			public static void main(String[] args) {
			
		HumanBeing hb = new HumanBeing();
		hb.demo();
		
	}
	

}
