import java.util.Scanner;

public class exercise15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How old are you?");
		int ageOfPerson = input.nextInt();
		
		if(ageOfPerson < 18) {
			System.out.println("You have not reached the required age.");
			
		} else if(ageOfPerson == 18) {
			System.out.println("You are 18. Lucky.");
			
		} else {
			System.out.println("You have reached the age of majority!");
		}
		
		input.close();
	}

}
