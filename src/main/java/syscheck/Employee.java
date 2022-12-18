package syscheck;

public class Employee extends Person {
	
	String EmpID;
	String Department;
	
	public Employee () {
		super();
		System.out.println("Hi I am Employee");
	}
	
	
	@Override
	public void printMyName() {
		System.out.println("This is Method from Puneet");
	}
	
	
}
