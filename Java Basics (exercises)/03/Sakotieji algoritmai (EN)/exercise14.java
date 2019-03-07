import java.util.Scanner;

public class exercise14 {

	public static void main(String[] args) {
		
		// positive number
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type a number: ");
		int number = input.nextInt();
		
		if(number > 0){
			System.out.println("The number is positive!");
			
		} else if(number == 0){
			System.out.println("The number is 0");
			
		} else {
			System.out.println("The number is not positive");
		}
		
		input.close();
	}

}
