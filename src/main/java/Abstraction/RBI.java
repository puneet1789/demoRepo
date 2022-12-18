package Abstraction;

public interface RBI extends Bank,Bank2 {

	
	public  void repoRate();
	
	
	default void FDIntrest() {
		System.out.println("This is default method FD intrest Rate = 8%");
	}
	
	static void FDIntrestStatic() {
		System.out.println("This is default method FD intrest Rate = 8%");
	}
	
}
