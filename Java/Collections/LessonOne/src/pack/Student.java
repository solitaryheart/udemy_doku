package pack;

public class Student {
	
	static String name = "Tom";
	static int age = 10;
	static char gender = 'M';
	String country = "USA";
	
	static void student(String name1, int age1,char gender1){ // method with parameters
		name=name1;
		age=age1;
		gender=gender1;
	}
	
	private Student() {
		System.out.println("I am inside constructor");
	}
	
	public static void main(String[] args) {
		
		
		
		Student stu = new Student();
		stu.student("Mark", 23, 'M');
		stu.country = "France";	
		Student stu2 = new Student();
		stu.student("Linda", 20, 'F');
		stu2.country = "Germany";
		
		student("Jerry", 5, 'M');
		
		//System.out.println(stu.name +"-"+stu.age+"-"+stu.gender + "-" + stu.country);
		
		//System.out.println(stu2.name +"-"+stu2.age+"-"+stu2.gender+ "-" + stu2.country);

		
	}
	
	
	
	
}
