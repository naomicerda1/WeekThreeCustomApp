package edu.whccd.ncerda;
import java.util.Scanner;

/*
          The purpose is to replicate input and outputs of the screenshot provided that ask for first and last name along with math problems with their results.
          author:       Naomi Cerda
 */

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter First Name: ");
		String fname = input.next();
		System.out.print("Enter Last Name: ");
		String lname = input.next();
		System.out.println();
		System.out.println("Hello " + lname + ", " + fname + "!");
		System.out.println("*******************");

		// perform calculation and display the results
		Scanner in = new Scanner(System.in);

		System.out.print("Enter A Whole Number: ");
		int num1 = in.nextInt();

		System.out.print("Enter Another Whole Number: ");
		int num2 = in.nextInt();

		System.out.println("Addition: " + num1 + " + " + num2 + " = " + (num1+num2));
		System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + (num1-num2));
		System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + (num1*num2));
		System.out.println("Division: " + num1 + " / " + num2 + " = " + (num1/num2));
		System.out.println("Modulus: " + num1 + " % " + num2 + " = " + (num1%num2));
	}
}
