import java.util.Scanner;

public class kilometrai1 {

	public static void main(String[] args) {
		
		// ivestus duomenis is kilometru konvertuoja i metrus
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Iveskite kilometrus: ");
		int km = input.nextInt();
		
		int m = km * 1000;
		
		System.out.println("Ivesta: " + km + ";");
		System.out.println("Gauta: " + m + ".");

	}

}
