import java.util.Scanner;

public class trikampis {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Iveskite krastine a:");
		int a = input.nextInt();
		System.out.println("Iveskite krastine b:");
		int b = input.nextInt();
		System.out.println("Iveskite krastine c:");
		int c = input.nextInt();

		if (c < a + b) {
			System.out.println("Trikampi galima sudaryti");

		} else {
			System.out.println("Trikampio sudaryti negalima");

		}

		input.close();
	}

}
