import java.util.Scanner;

public class exercise10 {

	public static void main(String[] args) {
		
		// calculating circumference of a circle
		// formula 2 * pi * radius
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Tell me the radius: ");
		double radius = input.nextDouble();
		
		double circ = 2 * Math.PI * radius; // in Java the PI is written with Math
		
		System.out.println("The circumference of a circle is: " + circ);

	}

}
