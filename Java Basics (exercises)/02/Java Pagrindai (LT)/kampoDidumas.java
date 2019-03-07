import java.util.Scanner;

public class kampoDidumas {

	public static void main(String[] args) {
		
		// nezinomo kampo diduma rasti
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Iveskite pirma kintamaji: ");
		int a = input.nextInt();
		
		System.out.println("Iveskite antra kintamaji: ");
		int b = input.nextInt();
		
		int sum = 180;
		
		int c = 180 - a - b;
		
		input.close();
		
		System.out.println("Ivesta: " + a + ", " + b + ";");
		System.out.println("Gauta: " + c);
	}

}
