import java.util.Scanner;

public class kilometrai2 {

	public static void main(String[] args) {
		
		// viska konvertuoja i metrus
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Iveskite kilometrus: ");
		int km = input.nextInt();
		
		System.out.println("Iveskite metrus: ");
		int m = input.nextInt();
		
		int metrais = km * 1000 + m;
		
		input.close();
		
		System.out.println("Ivesta: " + km + " km ir " + m + " m;");
		System.out.println("Gauta: " + metrais + ".");

	}

}
