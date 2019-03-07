import java.util.Scanner;

public class lyginis {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Ivesta");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
			System.out.println("Taip");

		} else {
			System.out.println("Ne");

		}

		input.close();

	}

}
