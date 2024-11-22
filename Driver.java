/**
 * Description: This program takes in 3 side lengths of a triangle and
 * 		will compute the perimeter of the triangle if the inputs are deemed
 * 		to be valid. The inputs will be considered valid if every pair of 
 * 		two sides is larger than the final side.
 * 
 * Inputs: User will need to input the three side lengths of a triangle:
 * 			-sideOne
 * 			-sideTwo
 * 			-sideThree
 * 
 * Outputs: The program will output the perimeter, if the inputs are valid.
 * 		Otherwise it will tell the user that the input is not valid.
 * 
 * @author Erik Jackson
 * @contact erik.jackson@my.century.edu
 * @since 09/15/2024
 * 
 * Institution: Century College
 * Class: CSCI 1082-01 Fa24
 * Professor: Mathew Nyamagwa
 * 
 */
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		// Prepares the program to accept inputs
		Scanner input = new Scanner(System.in);
		
		// Declares the variables for the side lengths, to be defined later.
		int sideOne;
		int sideTwo;
		int sideThree;
		// The variable "perimeter" will be the sum of all of the side lengths, once they are known.
		int perimeter;
		// The variable "isValid" will be changed to true if the inputs pass the validation tests.
		boolean isValid = false;
		
		// Explains the purpose of the program to the user.
		System.out.println("This program will calculate the perimeter of a triangle using inputs for the side lengths.");
		System.out.println("The sum of each pair of side lengths must be longer than the third side length.\n");
		
		// INPUTS
		// Collect user input for sideOne
		System.out.print("Please input the length of side one: ");
		sideOne = input.nextInt();
		
		// Collect user input for sideTwo
		System.out.print("Please input the length of side two: ");
		sideTwo = input.nextInt();
		
		// Collect user input for sideThree
		System.out.print("Please input the length of side three: ");
		sideThree = input.nextInt();
		
		// Validate inputs
		// A series of nested if statements checks to see if the sum of each pair of inputs is greater than the third side length.
		if ((sideOne + sideTwo) > sideThree) {
			if((sideOne + sideThree) > sideTwo) {
				if((sideTwo + sideThree) > sideOne) {
					//isValid is not set to true.
					isValid = true;
				};
			};
		};
		
		//COMPUTE
		perimeter = sideOne + sideTwo + sideThree;
		
		//OUTPUT
		// If the variable "isValid" has been changed to true, the program will acknowledge this and compute the perimeter.
		// Otherwise it will reject the inputs.
		if(isValid) {
			System.out.println("\nThe inputs are valid!"); 
			System.out.println("The perimeter of the triangle is " + perimeter + ".");
			System.out.println("(" + sideOne + " + " + sideTwo + " + " + sideThree + " = " + perimeter + ")");
		} else {
			System.out.println("\nThe inputs are not valid!");
		}
	}
}
