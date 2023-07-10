/**A simple program that calculates the area of a circle based on User's input*/

//IMPORTS
import java.util.Scanner;
import java.lang.Math;

public class CircleArea 
{
	public static void main(String[] args) 
	{
		/**INPUT*BLOCK********************************************/
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the radius of a circle: ");
		double num = input.nextDouble();
		System.out.printf("The area of your circle is: %.2f\n", circleArea(num));

	}//End of MAIN
	
	public static double circleArea (double radius)
	{
		double area=(Math.PI*(Math.pow(radius,2)));
		
		return area;
	}//End of METHOD
	
}//End of CLASS
