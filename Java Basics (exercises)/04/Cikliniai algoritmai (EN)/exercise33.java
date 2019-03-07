import java.util.Scanner;

public class exercise33 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Tell me the start:");
		int first = input.nextInt();
		System.out.println("Tell me the end:");
		int end = input.nextInt();

		for (; first > 0 && end <= 100;) {

			if (end > first)

				first++;

			int sum = first + ++first + end;
			System.out.println("Sum: " + sum);
			break;
		}

		input.close();

	}

}