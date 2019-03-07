import java.util.Scanner;

public class trikampis {

	public static void main(String[] args) {
		// apskaiciuojamas trikampio perimetras - visu krastiniu ilgis
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Iveskite krastine a: ");
		int a = input.nextInt();
		
		System.out.println("Iveskite krastine b: ");
		int b = input.nextInt();
		
		System.out.println("Iveskite krastine c: ");
		int c = input.nextInt();
		
		int perimetras = a + b + c;
		
		input.close();
		
		System.out.println("Gauti duomenys: " + a + ", " + b +", " + c + ";");
		System.out.println("Permietras: " + perimetras);

	}

}
