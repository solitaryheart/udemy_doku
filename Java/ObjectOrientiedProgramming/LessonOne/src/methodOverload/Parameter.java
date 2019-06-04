package methodOverload;

public class Parameter {
	
	void parameters(int num,String abc) { //Single parameters
		System.out.println("This method has no parameters");
	}
	
	void parameters(String abc,int num) {//Single parameters
		System.out.println("Single paramter");
	}
	
	void parameters() {//Single parameters
		System.out.println("Double paramter");
	}
	

	public static void main(String[] args) {
		
		
		Parameter par = new Parameter();

	}

}
