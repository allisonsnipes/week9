/*
 * Allison Snipes
 * Course 605.201.81 Summer 2020
 * Assignment 9 Question 1: IllegalArgumentException 
 * 
 *  Project Specs:
 *  This programming assignment involves learning about some of the common exceptions that occur in Java programs.
 *  Consider the following exception types: NullPointerException, ArrayIndexOutOfBoundsException, ClassCastException,
 *  and IllegalArgumentException. Research what each exception type means and the conditions under which each occurs 
 *  (i.e., is thrown). 
 *  
 *  Deliverables:
 *  Write programs that demonstrate each type of exception being thrown (one program per exception) and provide a 
 *  screen capture of the output. Name your programs as follows: NullPointerExceptionThrown, etc.
 *  	1. write a program that catches each type of thrown exception and display an error message indicating some of
 *  	   the details as to what that exception is. 
 *  	2. Write one program per type of exception. Name your programs as follows: NullPointerExceptionCatch, etc.
 */

import java.util.Scanner;

/*
 * Here I will set up my classes and subclasses which will be needed to throw the NullPointerExceptionThrown for the Employee class.
 */
public class IllegalArgumentExceptionCatch extends Throwable {

	public static void main(String[] args) {
		headerMsg();
		try {
			System.out.println("Please enter a random number to obtain a percentage: \n");
			Scanner input = new Scanner(System.in);
			int percent = input.nextInt();
			if (percent > 100 || percent < 0) {
				throw new IllegalArgumentException();
			}
		} catch(IllegalArgumentException e) {
			System.out.println("There is an error: ");
			e.printStackTrace();
		}
	}
	
	public static void headerMsg() {
		System.out.println("\n");
		System.out.println("+------------------------------------------------------------------------------------+");
		System.out.println("|                                         Welcome User,                              |");
		System.out.println("|    This application will demonstrate how a IllegalArgumentException is generated.  |");
		System.out.println("|       This type of exception is thrown when a method is passed by an illegal or    |");
		System.out.println("|                    inappropriate argument. Let's view this example!                |");
		System.out.println("+------------------------------------------------------------------------------------+");
		System.out.println("\n");
	}
}
