package Abstraction;

public interface Bank {

	
	float rateOfInterest();
	int interest();

	default void functionName() {
		System.out.println("This is default method");
	}
	
	static void functionNameStatic() {
		System.out.println("This is Static method");
	}
	
}
