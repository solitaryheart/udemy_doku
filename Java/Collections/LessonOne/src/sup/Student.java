package sup;

public class Student {
	
	String name;
	int age;
	char gender;
	
	Student(){
		this("Name",38,'M');
	}
	
	Student(String name, int age,char gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
		
	}
	
	
	public static void main(String[] args) {
		
		Student stu = new Student();
		//Student stu2 = new Student("Linda",25,'F');
		System.out.println(stu.name +"-"+stu.age+"-"+stu.gender);
		//System.out.println(stu2.name +"-"+stu2.age+"-"+stu2.gender);

		
	}
	
	
	
	
}
