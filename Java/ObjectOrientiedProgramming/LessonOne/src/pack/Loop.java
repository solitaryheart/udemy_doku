package pack;

public class Loop {

	public static void main(String[] args) {
		// for loop
		
	for(int i=0; i<=10 ;i++) {
		
		System.out.println("Outer loop: "+ i);
		
			for(int j=0;j<=5;j++) {
				System.out.println("   Inner Loop: "+ j);
				
			}	 
	}
	
	
	
	
	/*int i=0;
	while(i<=10) {
		System.out.println(i);
		i++;
	}*/
		
	/*int i = 0; // Initialization happens here
	do {
		
		System.out.println("the value is =" + i);
		i++;
	}while(i<10);*/
		
	}

}
