import java.util.Scanner;

public class vanduo {

	public static void main(String[] args) {
		
		// per 1h = 18l
		// per diena prarandama bus = 18l * 24h
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Per valanda isgeba litru vandens: ");
		int perValanda = input.nextInt();
		
		int perDiena = perValanda * 24;
		int perSavaite = perDiena * 7;
		
		input.close();
		
		System.out.println("Gauta: per diena - " + perDiena + ", per savaite - " + perSavaite + ".");

	}

}
