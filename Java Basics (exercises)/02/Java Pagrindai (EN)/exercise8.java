import java.util.Scanner;

public class exercise8 {

	public static void main(String[] args) {
		
		// program asks for numbers and then calculates their sum
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("First number: ");
		int first = input.nextInt();
		
		System.out.println("Second number: ");
		int second = input.nextInt();
		
		int sum = first + second;
		
		System.out.println("The sum is: " + sum);

	}

}
