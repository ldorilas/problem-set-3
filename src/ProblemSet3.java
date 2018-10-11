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
    
	private static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		ProblemSet3 pset3 = new ProblemSet3();
		
		//exercise 1
		System.out.println("Your clothing rating: ");
		int you = in.nextInt();
		System.out.println("Your date's clothing rating: ");
		int date = in.nextInt();
		pset3.dateFashion(you, date);
		
		
		//exercise 2
		System.out.println("Type a word: ");
		String str = in.nextLine();
		pset3.fizzString(str);
		
		//exercise 3
		System.out.println("Temperature outside: ");
		int temp = in.nextInt();
		System.out.println("Is it the summer?");
		boolean isSummer = in.nextBoolean();
		pset3.squirrelPlay(temp, isSummer);
		
		//exercise 4
		System.out.println("Number: ");
		int n = in.nextInt();
		pset3.fizzStringAgain(n);
		
		//exercise 5 
		System.out.println("Goal: ");
		int goal = in.nextInt();
		System.out.println("Number of small bricks: ");
		int small = in.nextInt();
		System.out.println("Number of big bricks: ");
		int big = in.nextInt();
		pset3.makeBricks(small, big, goal);
        
        //exercise 6
        System.out.println("First integer: ");
		int a = in.nextInt();
		System.out.println("Second integer: ");
		int b = in.nextInt();
		System.out.println("Third integer: ");
		int c = in.nextInt();
		pset3.loneSum(a, b, c);
		
		//exercise 7
		System.out.println("First integer: ");
		int a = in.nextInt();
		System.out.println("Second integer: ");
		int b = in.nextInt();
		System.out.println("Third integer: ");
		int c = in.nextInt();
		pset3.loneSum(a, b, c);
        
	    //exercise 8
		System.out.println("Enter number: ");
		int n = in.nextInt();
		pset3.factorialWithFor(n);
		
		
        //exercise 9
		System.out.println("Enter number: ");
		int x = in.nextInt();
		pset3.factorialWithWhile(x);
		
		//exercise 10
		System.out.println("Enter number: ");
		int n = in.nextInt();
		pset3.isPrime(n);
		
		
		in.close();
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
	int stringlen = str.length();
	char first = str.charAt(0);
	char last = str.charAt();
	
	if (first == 'f' || first == 'F') {
		System.out.println("FIZZ");
	    }
	else if (last == 'b' || last == 'B') {
		System.out.println("BUZZ");
	    }
	else if (((first == 'f' || first == 'F') && (last == 'b' || last == 'B'))) {
	    System.out.println("FIZZBUZZ");
	    }
	else {
	    System.out.println(str);
	    }
	}
	
	public void squirrelPlay (int temp, boolean isSummer) {
	if (isSummer = false) {
	    if (temp >= 60 && temp <= 90) {
	    System.out.println("YES");
	    }
	    else {
	        System.out.println("NO");
	    }
	}
	else {
	   if (temp >= 60 && temp <= 90) {
	    System.out.println("YES");
	    }
	else {
		System.out.println("NO");
		}
	}
}
	
	public void fizzStringAgain (int n) {
	    if ((n % 3) == 0) {
	        System.out.println("FIZZ");
	    }
	    else if ((n % 5) == 0) {
	        System.out.println("BUZZ");
	        }
	    else if ((n % 3) && (n % 5) != 0) {
	        System.out.println(n + "!");
	    }
	    else if ((n % 3) && (n % 5) == 0) {
	        System.out.println("FIZZBUZZ");
	    }
	
	public void makeBricks (int small, int big, int goal) {
	if (((1 * small) + (5 * big)) == goal) {
		System.out.println("YES");
		}
	else if (((1 * small) + (5 * big)) > goal) {
	    System.out.println("YES");
	    }
	else if (((1 * small) + (5 * big)) < goal) {
		System.out.println("NO");
		}
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
	else if (a != b && c == 13) {
	    System.out.println((a + b));
	    }
	else if (b == 13 && b == c) {
	    System.out.println((a));
	    }
	else if (a == 13) {
	    System.out.println(("0"));
	    }
	}
	
	int i;
	
	public void factorialWithFor (int n) {
	int initialn = n;    
	    for (int i = n; i > 0; i--) {
	    if (i == n) {
	        n = n * 1;
	        }
	    else if (n > i) {
	        n = n * i;
	        }
	  	}
	  	System.out.println(initialn + "! = " + n);
	}
	
	public void factorialWithWhile (int x) {
	int initialx = x;
	int i = x;
	while (i > 0) {
	    if (i == x) {
	        x = x * 1;
	        i--;
	        }
	    else {
	        x = x * i;
	        i--;
	        }
	    }
	    System.out.println(initialx + "! = " + x);
	}
	
	public void isPrime (int n) {
	boolean primeNum = false;
	    int initialn = n;
	    int i = n
	    while (i > 0) {
	        if (i == n) {
	            n = initialn * 1;
	            i--;
	        }
	        else {
	            n = initialn % i;
	            i--;
	            if (n == 0) {
	                primeNum = true;
	            }
	        }
	    }
	    if (primeNum == true) {
	        System.out.println(initialn + " is not prime.");
	    }
	    if (primeNum = false) {
	        System.out.println(initialn + " is prime.");
	    }
	}
}
