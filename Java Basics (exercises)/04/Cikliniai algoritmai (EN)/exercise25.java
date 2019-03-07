import java.util.Scanner;

public class exercise25 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insert the first number:");
		int a = input.nextInt();

		System.out.println("Insert the second number: ");
		int b = input.nextInt();

		System.out.println("Insert the third number: ");
		int c = input.nextInt();

		int sum = a + b + c;

		input.close();

		System.out.println("Sum: " + sum);

	}

}
