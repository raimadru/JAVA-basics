import java.util.Scanner;

public class exercise26 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Type a number:");
		int x = input.nextInt();

		while (x > 0) {
			System.out.println("Type another number: " + x);
			int x1 = input.nextInt();

			System.out.println(x1 + x);

			if (x1 == 0) {
				System.out.println("The final sum: " + x1);
			}
		}

		input.close();

	}

}
