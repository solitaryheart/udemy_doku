package fin;

public class Employee {
	
	 final String EMPLOYEE_ID; // blank final variable
	 String name;
	 
	 Employee(String EMPLOYEE_ID, String name){
		 this.EMPLOYEE_ID = EMPLOYEE_ID;
		 this.name = name;
	 }

	public static void main(String[] args) {

		Employee emp = new Employee("838373", "Mark");
		System.out.println(emp.name + "-"+emp.EMPLOYEE_ID);
		

	}

}
