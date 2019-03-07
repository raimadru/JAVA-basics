import java.util.Scanner;

public class exercise18 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type the points: ");
		int number = input.nextInt();
		
		if(number < 29 || number == 0) {
			System.out.println("Fail");
			
		} else if (number >= 30 && number < 35) {
			System.out.println("1");
			
		} else if (number >= 35 && number < 40) {
			System.out.println("2");
			
		} else if (number >= 40 && number < 45) {
			System.out.println("3");
			
		} else if (number >= 45 && number < 50) {
			System.out.println("4");
			
		} else if (number >= 50 && number < 61) {
			System.out.println("5");
		}
		
		input.close();

	}

}
