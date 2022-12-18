package bronto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstDemo {

	public static void main(String[] args) {

		
		//System.out.print("*\n");
		//System.out.print("**\n");
		//System.out.print("***\n");
		//System.out.print("****");
		
		
		//Variables
//		int x = 5;
//		boolean b = true;
//		float f = 2.5f;
//		double d = 4.00000;
//		
//		char a = 'b';
		
//		String[] MyStringArray = {"Hi", "How", "are"};
//		int[] MyIntArray = {1,52,35,69};
//		
//		System.out.println(MyStringArray[2]);
//		
//		System.out.println(MyStringArray.length);
//		
//		
//		
//		double a = 5;
//		int b = 10;
//		
//		float demo = (float)a / b;
//		System.out.println(demo);
//		
//		ArrayList<Object> alo = new ArrayList<>();
//		alo.add(1);
//		alo.add("String");
//		
//		List<Object> lo = new ArrayList<>();
		
//		(a+b)+c+d/4*v
		
		
// conditions
		/*
		 * 1- if Else 2- Nested if Else 3- Switch
		 * >, <, == , !=, >=, <=
		 * 
		 * Concatination 
		 * || - OR
		 * && - AND
		 */
//		int a = 11, b=11;
//		
//		if (a>b && a == b) {
//			System.out.println("Output is a > b");
//		} else if (a<b) {
//			System.out.println("Output is b > a");
//		} else {
//			System.out.println("Output is a = b");
//		}
		
//	//	int myGrade = 0;// = "A";
//		char myChar = 'Z';
//		switch(myChar) {
//		case 'A': 
//			
//		case 'B' :
//			System.out.println ("Thats an ok grade");
//			break;
//		case 'C' :
//			System.out.println ("Need to work More");
//			break;
//		default :
//			System.out.println ("Need to enter grade");
//			break;
//		}
//		
//		
//		
		/*
		 * Loops are of 3 type 1) For 2) While 3) Do- While
		 * 
		 * 4) For Each - self
		 */

//
//		for (int i = 1; i <= 100; i++ ) {	
//			if (i <10 )
//			System.out.println ("Need to enter grade   >>>  " + i);
//			
//			if (i == 20) {
//				break;
//			}
//		}
		
//		int i = 2;
//		while (i != 0) {
//			System.out.print ("Need to enter  >>>  ");
//			Scanner sc = new Scanner(System.in);			
//	        i = sc.nextInt();
//	        System.out.println("entered  >>>  " + i);
//		}
		
//		int i;
//		
//		Scanner  sc = new Scanner(System.in);
//		i = sc.nextInt();
//		
//		while(i < 5) {
//			if (i == 6) {
//				System.out.println(i);
//			} else {
//				System.out.println("something");
//				break;
//			}
//			//Scanner  sc = new Scanner(System.in);
//			//i = sc.nextInt();
//		}
		
		
//		int i=0; 
//		do {
//			
//			System.out.println(i);
//			i++;
//		} while (i != 5);
//		
		
//		String str = "Value,Some,NewVaue";		
//		System.out.println(str.charAt(3));
//		
////		System.out.println(str.compareTo("23Value"));
////		System.out.println(str.compareToIgnoreCase("value"));
////		System.out.println(str.equalsIgnoreCase("value"));
//		String[] output = str.split(",");
//		System.out.println(output[1]);
//	System.out.println(str.indexOf("N"));
//		
		
		/*
		 * String[] output = str.split(","); System.out.println(output.length -1);
		 */
		
		
		
		//Method
		//System.out.println("Addtion is : " + function_Addition(10.00,2.0f, 1));
		
		
//		Rectangle rectangle1 = new Rectangle(15,25);
//		rectangle1.parameter();
//		Rectangle rectangle2 = new Rectangle();
//		rectangle1.parameter();
//		rectangle2.parameter();
//		rectangle2.length = 100;
//		rectangle2.breadth = 100;
//		rectangle2.parameter();
//		
//		rectangle1.parameter();
//		
		
		Rectangle rec1 = new Rectangle(10,10);
		System.out.println(rec1.getLength());
		rec1.setLength(100);
		System.out.println(rec1.getLength());
//		Rectangle rec2 = new Rectangle(20,20);
//		rec2.parameter();
//		rec1.parameter();
//		
//		Rectangle.length = 0;
	}
	
//	static int function_Addition (int a, int b) {	
//		//some oprtion 
//		return a+b;
//	}
//	
//	//Method overloading	
//	static String function_Addition (Double a, Float b, int c) {
//		
//		return " Doubt run";
//	}
	
	///AM - 4 
	/*  Default 
	 * Public 
	 * private
	 * protected
	 */
}
