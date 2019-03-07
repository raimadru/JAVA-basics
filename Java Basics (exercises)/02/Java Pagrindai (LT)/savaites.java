import java.util.Scanner;

public class savaites {

	public static void main(String[] args) {
		
		// pirma metu diena - pirmadienis
		// nuo metu pradzios praejo d dienu
		// kieke savaiciu s praejo nuo metu pradzios
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Dienu skaicius: ");
		int d = input.nextInt();
		
		int s = d / 7;
		
		input.close();
		
		System.out.println("Ivesta: " + d + " dienu");
		System.out.println("Gauta: " + s + " savaites");


	}

}
