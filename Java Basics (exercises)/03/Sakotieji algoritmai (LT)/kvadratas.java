import java.util.Scanner;

public class kvadratas {

	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		System.out.println("Iveskite skaiciu: ");
		int n = input.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("Kvadrata sudaryti galima");
			
		} else {
			System.out.println("Kvadrato sudaryti negalima");
		}

	}

}
