import java.util.Scanner;

public class exercise12 {

	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		System.out.println("Type your name: ");
		String firstName = input.nextLine();
		
		System.out.println("Type your age: ");
		int ageFirst = input.nextInt();
		
		System.out.println("Type another name: ");
		String secondNam = input.nextLine();
		
		System.out.println("Type another age: ");
		int ageSecond = input.nextInt();
		
		int sum = ageFirst + ageSecond;
		
		System.out.println(firstName + " and " + secondNam + " is " + sum + " years old in total.");

	}

}
