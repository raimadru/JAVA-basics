import java.util.Scanner;

public class exercise30 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Write the end point number:");
		int y = input.nextInt();
		
		do {
			System.out.println(y);
			y--;
			
		} while (y > 0 && y <= 100);
		
		input.close();

	}

}
