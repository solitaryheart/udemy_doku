package pack;

public class Calculations {
	
	int num1;
	int num2;
	int sum, product;
	
		int sum(int num1, int num2) { // function or method
			
			sum = num1 + num2;
			System.out.println("sum is: " + sum);
			return sum;
			
		}
		
		int product(int num1, int num2) {
			product = num1*num2;
			System.out.println("product is: " + product);
			return product;
		}

	public static void main(String[] args) {
		int result;
		Calculations cal = new Calculations(); // object instantiations
		
		result = cal.sum(10,25) + cal.product(5,9);
		System.out.println("result is " + result);
				
	}

}
