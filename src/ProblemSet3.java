/**
 * INSTRUCTIONS.
 * 
 * Problem Set 3 will be more extensive than the first two. You've been warned. Practice makes perfect,
 * and we'll get a lot of practice with conditional and iterative control structures.
 * 
 * A few new concepts are being introduced with this assignment. Last time, we saw methods (other than
 * the @main method) for the first time. Now, we're seeing parameters, which are the variables inside
 * the parentheses in our methods. We'll cover these in more detail later. For now, you just need to
 * understand the basics.
 * 
 * A parameter is data that is provided to the method. It helps the method do its job. It's passed in
 * through the parentheses, and you can reference these variables by name as if they're your own.
 */
import java.util.Scanner;
public class ProblemSet3 {
	
	/**
	 * Make sure you're testing your code by calling your methods from the main method!
	 */
    
	Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		ProblemSet3 pset3 = new ProblemSet3();
		System.out.println("Your clothing rating: ");
		int you = in.nextInt();
		System.out.println("Your date's clothing rating: ");
		int date = in.nextInt();
		pset3.dateFashion(you, date);
		System.out.println("Type a word: ");
		String str = in.nextLine();
		pset3.fizzString(str);
		System.out.println("First integer: ");
		int a = in.nextInt();
		System.out.println("Second integer: ");
		int b = in.nextInt();
		System.out.println("Third integer: ");
		int c = in.nextInt();
		pset3.loneSum(a, b, c);
		System.out.println("Temperature outside: ");
		int temp = in.nextInt();
		System.out.println("Is it the summer?");
		boolean isSummer = in.nextBoolean();
		pset3.squirrelPlay(temp, isSummer);
		System.out.println("Enter number: ");
		int n = in.nextInt();
		
		
		in.close();
		//pset3.loneSum(1, 2, 3);
        //pset3.luckySum(1, 2, 3);
        //pset3.squirrelPlay(68, false);
        //pset3.factorialWithFor(3);
	}
	
	public void dateFashion(int you, int date) {
	if (you == 10 && date == 10) {
		System.out.println("YES");
    	}
    else if (((you <= 10 && you >= 8) && (date <= 10 && date >= 8))) {
        System.out.println("YES");
        }
    else if ((you == 2 && date == 10) || (you == 10 && date == 2)) {
        System.out.println("NO");
        }
    else if (((you <=10 && you >= 8) && (date == 2))) {
        System.out.println("NO");
        }
    else if (((you == 2) && (date <= 10 && date >= 8))) {
        System.out.println("NO");
        }
    else if (((you <= 7 && you == 2) || (date <= 7 && date == 2))) {
        System.out.println("NO");
        }
    else if (((you <= 7 && you > 2) || (date <= 7 && date > 2))) {
        System.out.println("MAYBE");
        }
	}
	

	
	public void fizzString(String str) {	
	char first = str.charAt(0);
	char last = str.charAt(str.length() - 1);
	
	if (first == 'f' || first == 'F') {
		System.out.println("FIZZ");
	    }
	else if (last == 'b' || last == 'B') {
		System.out.println("BUZZ");
	    }
	else if ((first == 'f' && last == 'b') || (first == 'F' && last == 'B')) {
	    System.out.println("FIZZBUZZ");
	    }
	else {
	    System.out.println(str);
	    }
	}
	
	public void squirrelPlay (int temp, boolean isSummer) {
	if ((temp >= 60 && temp <= 90) && isSummer == false) {
	    System.out.println("YES");
	    }
	else if ((temp > 90 && temp <= 100) && isSummer == true) {
	    System.out.println("NO");
	    }
	else if ((temp >= 60 && temp <= 90) && isSummer == true) {
		
		}
	}
	
	public void fizzStringAgain (int n) {
	    
	}
	
	public void makeBricks (int small, int big, int goal) {
	    
	}
	
	public void loneSum (int a, int b, int c) {
	if (a != b && b != c && a != c) {
	    System.out.println((a + b + c));
	    } 
	else if (a == b && b != c && a != c) {
	    System.out.println((c));
	    }
	else if (a != b && b == c && a != c) {
	    System.out.println((a));
	    }
	else if (a != b && b != c && a == c) {
	    System.out.println((b));
	    }
	else if (a == b && b == c && a == c) {
	    System.out.println("0");
	    }
	}
	
	
	public void luckySum (int a, int b, int c) {
	System.out.println("First integer: ");
	a = in.nextInt();
	System.out.println("Second integer: ");
	b = in.nextInt();
	System.out.println("Third integer: ");
	c = in.nextInt();
	
	if (a != b && b != c && a != c) {
	    System.out.println((a + b + c));
	    } 
	else if (a != b && b != c && c == 13) {
	    System.out.println((a + b));
	    }
	else if (a != b && b == 13 && a != c) {
	    System.out.println((a));
	    }
	else if (a == 13 && b != c && a != c) {
	    System.out.println(("0"));
	    }
	}
	
	int i;
	
	public void factorialWithFor (int n) {
	    for (i = 1; i < n; i++) {
		System.out.println(n * i);
		n--
	    }
	}
	
	public void factorialWithWhile (int n) {
	    
	}
	
	public void isPrime (int n) {
	    
	}
}
