import java.util.Scanner;

public class exercise36_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Type numbers:");
		int a = input.nextInt();
		int b = input.nextInt();

		if (a > 0 && b > 0) {
			System.out.println("Ok");

		} else if (a == -1 || b == -1) {
			System.out.println("Thank you and see you later!");

		}
		
		input.close();

	}

}
