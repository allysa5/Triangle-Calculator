import java.util.Scanner;

public class TriangleCalculator {
	public static void main (String[] args){
	double side1, side2, side3;
	
	Scanner keyboard  = new Scanner(System.in);
	System.out.print("enter three sides");
	side1= keyboard.nextDouble();
	side2= keyboard.nextDouble();
	side3= keyboard.nextDouble();
	if ((side2 == side1) && (side2 == side3) && (side3 == side1)) {  
		 System.out.print("equilateral");
	} else {
			 System.out.print("not equilateral");
	}
		
		
	}
}
