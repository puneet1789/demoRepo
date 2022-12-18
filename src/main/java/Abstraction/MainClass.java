package Abstraction;

public class MainClass {

	
	public static void main(String[] args) {
		/*
		 * Car1 bmw = new Car1();
		 * 
		 * 
		 * bmw.Start(); bmw.functionName();
		 * 
		 * 
		 * 
		 * Bike1 bullet = new Bike1(); bullet.Start(); bullet.functionName();
		 */
		
		SBI sb = new SBI();
		PNB pb = new PNB();
		
		
		
		System.out.println("SBI  :" + sb.rateOfInterest());
		sb.functionName();
		
		//sb.FDIntrest();
		RBI.FDIntrestStatic();
	
	}
	
	
}
