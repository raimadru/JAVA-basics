import java.util.Scanner;

public class exercise19 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How old are you?");
		int ageInput = input.nextInt();
		
		if(ageInput < 0) {
			System.out.println("Impossible!");
			
		} else if (ageInput > 0 && ageInput < 19) {
			System.out.println("Nice, you still have childhood.");
			
		} else if (ageInput > 18 && ageInput < 61) {
			System.out.println("Ok!");
			
		} else if (ageInput > 59 && ageInput < 100) {
			System.out.println("Nice");
			
		} else if (ageInput > 99 && ageInput < 150) {
			System.out.println("Impossible!");
			
		}
		
		input.close();
	}

}
