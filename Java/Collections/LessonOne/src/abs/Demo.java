package abs;

public class Demo implements Learning {
	
	public static void main(String[] args) {
		System.out.println(Demo.number);
		Demo demo = new Demo();
		demo.method1();
		demo.method2();

	}

	@Override
	public void method1() {
		System.out.println("method1");
		
	}

	@Override
	public void method2() {
			System.out.println("method2");		
	}

}
