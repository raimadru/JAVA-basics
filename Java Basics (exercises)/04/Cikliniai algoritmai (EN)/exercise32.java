import java.util.Scanner;

public class exercise32 {

	private static int y;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Write the end point number:");
		y = input.nextInt();

		do {
			int sum = y + (y*y++);
			System.out.println("Sum: " + sum);
			
			y--;
			
			break;

		} while (y > 0 && y <= 100);

		input.close();

	}

}
