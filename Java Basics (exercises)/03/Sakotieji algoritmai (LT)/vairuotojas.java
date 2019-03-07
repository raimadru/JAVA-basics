import java.util.Scanner;

public class vairuotojas {

	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		System.out.println("Turi pervezti deziu i sandeli:");
		int n = input.nextInt();
		
		System.out.println("I masina telpa:");
		int m = input.nextInt();
		
		
		if (n < m || n == m ) {
			int k1 = 1;
			System.out.println("Reikes vaziuoti kartu: " + k1);
			
		} else if (n > m) {
			int k2 = n / m;
			System.out.println("Vaziuos: " + k2);
			
		}

	}

}
