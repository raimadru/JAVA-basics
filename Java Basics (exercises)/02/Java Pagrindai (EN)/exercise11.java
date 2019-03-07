import java.util.Scanner;

public class exercise11 {

	public static void main(String[] args) {
		
		// Math.max, giving bigger number
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Give me number: ");
		int first = input.nextInt();
		
		System.out.println("Give one more number: ");
		int second = input.nextInt();
		
		int n = Math.max(first, second);
		
		System.out.println("Bigger number: " + n);

	}

}
