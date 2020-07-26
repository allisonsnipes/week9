/*
 * Allison Snipes
 * Course 605.201.81 Summer 2020
 * Assignment 9 Question 1: NullPointerException
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

/*
 * Here I will set up my class which will be needed to throw the NullPointerExceptionThrown for the main class.
 */

import java.util.Scanner;

class Name {
	public String firstName;
	
	public String getF() {
		return firstName;
	}
	
	public void setF(String firstName) {
		this.firstName = firstName;
	}
	
	public Name(String firstName) {
		this.firstName = firstName;
	}
	
	public String toString() {
		return firstName;
	}
}

/*
 * The main method where the condition occurs to throw the exception.
 */
public class NullPointerExceptionThrownCatch {

	public static void main(String[] args) {
		headerMsg();
	
		Name testName = null;
		
		try {
			String userName = testName.firstName;
			
			
		} catch (NullPointerException e) {
			System.out.println("There is an error: " + e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	public static void headerMsg() {
		System.out.println("\n");
		System.out.println("+------------------------------------------------------------------------------------+");
		System.out.println("|                                    Welcome User,                                   |");
		System.out.println("|      This application will demonstrate how a NullPointerException is generated.    |");
		System.out.println("|   This type of exception is thrown when an application attempts to use null in a   |");
		System.out.println("|          case where an object is required. Let's view this example!                |");
		System.out.println("+------------------------------------------------------------------------------------+");
		System.out.println("\n");
	}

}
