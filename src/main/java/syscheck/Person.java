package syscheck;

public class Person {

	String Name;
	char Gender;
	int Age;
	
	
	public Person () {
		System.out.println("Hi I am Person");
	}
	
	public Person (int i) {
		System.out.println("Hi I am Person" + i);
	}
	
	
	
	public void printMyName() {
		System.out.println("This is Method from Person");
	}
}
