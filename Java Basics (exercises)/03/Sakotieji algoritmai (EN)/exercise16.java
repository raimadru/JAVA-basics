import java.util.Scanner;

public class exercise16 {

	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		System.out.println("Tell me a number: ");
		int n = input.nextInt();
	
		if(n % 2 == 0) {
			System.out.println("The number is even.");
			
		} else {
			System.out.println("The number is odd.");
		}
		
	}
	
}
