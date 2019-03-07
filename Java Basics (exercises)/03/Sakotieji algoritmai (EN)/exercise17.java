import java.util.Scanner;

public class exercise17 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type the first number: ");
		int a = input.nextInt();
		
		System.out.println("Type the second number: ");
		int b = input.nextInt();
		
		if(a > b) {
			System.out.println("The greater number: " + a);
			
		} else if(a == b) {
			System.out.println("The numbers are equal.");
			
		} else {
			System.out.println("The greater number: " + b);
		}
		
		input.close();

	}

}
