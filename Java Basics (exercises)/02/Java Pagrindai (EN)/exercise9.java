import java.util.Scanner;

public class exercise9 {
	public static void main(String[] args) {
		
		// asks for numbers and divides them
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("First number: ");
		double first = input.nextDouble();
		
		System.out.println("Second number: ");
		double second = input.nextDouble();
		
		double division = first / second;
		
		System.out.println("Division is: " + division);
	}
}
