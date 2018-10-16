// Created by Aaron Messich
// This is a gathering of tiny programs.

import java.util.Random;


/* data types are byte, boolean, char, short, int, long, float, double
	short, int, long, float, and double are number oriented with float and double being the only
	ones that can handle decimals
	byte is simply a byte, boolean is either true/false, and char can handle only a single letter
	and must be placed inside single quotes ''
	
*/

public class Main {

	public static void main(String[] args) {
		
		String greeting = "Hello! Welcome to my program!"; // declaring and assigning string to be used as a greeting
		int passedInt = 5; // passedInt is the number being passed as an argument to useThatData
		
		boolean didComplete = useThatData(greeting, passedInt); // method call. greeting and passedInt are arguments
		Random randomNum = new Random();
		int dayOfWeek = randomNum.nextInt(7); // get random number from 0 to 7, with 0 being sunday
		System.out.println(weekProblems(dayOfWeek)); // prints day of the week based on random number
		
		mathProblems();

	}
	
	public static boolean useThatData(String s, int i) { // whole thing is header. parameters are s and i
		
		System.out.printf("%s%n", s); //use of string and printing greeting. the variable, s, is a local
								// variable that will not interfere outside of this method
		final double USELESS_DOUBLE = (double)i; //use of final means it cannot be changed, casting i
											// turns it from int to double before assigning
		boolean didPrint; // the scope is method only
		
		if (s.length() >= i) { // measures the length of the string and compares it to int i
			System.out.println(s.charAt(i -1)); // if the string is long enough it will print char at i-1
			String letter = "o";
			String sLetter = Character.toString(s.charAt(i - 1));
			String ifTrue = (letter.equals(sLetter)) ? "Char at int is o." : "Char at int is not o.";
			System.out.println(ifTrue);
		}
		else {
			System.out.println("String isn't long enough.");
		}
		didPrint = (s.length() >=i) ? true : false; // ternary operator to see if it could find charAt
		
		return didPrint;
	}
	
	public static String weekProblems(int week) {
		
		String weekDay = null;
		switch(week) {
			case 0: weekDay = "Sunday";
				break;
			case 1: weekDay = "Monday";
				break;
			case 2: weekDay = "Tuesday";
				break;
			case 3: weekDay = "Wednesday";
				break;
			case 4: weekDay = "Thursday";
				break;
			case 5: weekDay = "Friday";
				break;
			case 6: weekDay = "Saturday";
				break;
			
		}
		
		return weekDay;
	}
	
	public static void mathProblems() {
		
		int subtractor = 0;
		int doublor = 1;
		double pi = Math.PI;
		for (double pizzaSize = 1; pizzaSize <= 5; pizzaSize++) {
			double pizzaArea = Math.pow((pizzaSize/2), 2) * pi;
			System.out.printf("With a diameter of %f the pizza has an area of %f%n", pizzaSize, pizzaArea );
			// operator precedence: if the ++ or -- happens before the variable then it happens before the
			// the variable is assigned, if after then it uses variable first then increments/decrements
			subtractor--;
			doublor += doublor;
			System.out.printf("subtractor is %d and doublor is up to %d%n", subtractor, doublor);
		}
	}

}
