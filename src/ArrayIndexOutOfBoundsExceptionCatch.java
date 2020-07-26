/*
 * Allison Snipes
 * Course 605.201.81 Summer 2020
 * Assignment 9 Question 1: ArrayIndexOutOfBoundsException
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
 * Here I will set up my classes and subclasses which will be needed to throw the NullPointerExceptionThrown for the Employee class.
 */
public class ArrayIndexOutOfBoundsExceptionCatch {

	public static void main(String[] args) {
		headerMsg();
		
		//create a simple array
		int[] simpleArray = new int[] {1, 2, 3, 4, 5};
		
		int testArray = simpleArray[5];
	}
	
	public static void headerMsg() {
		System.out.println("\n");
		System.out.println("+-----------------------------------------------------------------------------------------+");
		System.out.println("|                                          Welcome User,                                  |");
		System.out.println("|            This application will demonstrate how a ArrayIndexOutOfBoundsException is    |");
		System.out.println("|                generated. This type of exception is thrown when an array was            |");
		System.out.println("|              accessed with an illegal index. The index was either negative or greater   |");
		System.out.println("|                     than or equal to the size of the array. Let's begin!                |");
		System.out.println("+-----------------------------------------------------------------------------------------+");
		
		System.out.println("\n");
	}

}
