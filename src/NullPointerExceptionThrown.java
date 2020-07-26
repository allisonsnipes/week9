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
 * Here I will set up my classes and subclasses which will be needed to throw the NullPointerExceptionThrown for the Employee class.
 */
class Name {
	private String firstName, lastName;
	
	public String getF() {
		return firstName;
	}
	
	public void setF(String firstName) {
		this.firstName = firstName;
	}
	
	public String getL() {
		return lastName;
	}
	
	public void setL(String lastName) {
		this.lastName = lastName;
	}
	
	public Name(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String toString() {
		return firstName + " " + lastName;
	}
}

class Address{
	
}

class Employee {
	private int id;
	private Name name;
	private Address address;
	
	public int getId() {
		return id;
	}
	
	public void setId() {
		this.id = id;
	}
	
	public Name getName() {
		return name;
	}
	
	public void setName() {
		this.name = name;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress() {
		this.address = address;
	}
	
	public Employee (int id, Name name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
}


/*
 * The main method where the condition occurs to throw the exception.
 */
public class NullPointerExceptionThrown {

	public static void main(String[] args) {
		headerMsg();
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
