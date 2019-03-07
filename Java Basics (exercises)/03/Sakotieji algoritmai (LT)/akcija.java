import java.util.Scanner;

public class akcija {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Perkama prekiu:");
		double vnt = input.nextDouble();
		
		System.out.println("Vienos prekes kaina:");
		double k = input.nextDouble();
		
		double suma = k * vnt;
		
		if(vnt >= 3) {
			double prekiuSuma = (double) ( (vnt * k) + (0.2 * k * vnt));
			System.out.println("Suma su nuolaida: " + prekiuSuma);
			
		} else {
			System.out.println("Suma: " + suma);
		}
		
		input.close();

	}

}
