import java.util.Scanner;

public class filmas {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Filmas prasideda valanda: ");
		int h = input.nextInt();
		
		System.out.println("Minutes: ");
		int min = input.nextInt();
		
		System.out.println("Filmo trukme: ");
		int trukme = input.nextInt();
		
		//filmo metu yra trys reklamos po 10 min
		
		int reklama = 30;
	
		int min1 = ((min + reklama + trukme) % 60);
		int trukme1 = trukme + reklama;
		int h1 = h + (trukme1 / 60);
		
		input.close();
		
		System.out.println("Filmo pradzia: " + h + ":" + min + ", " + " trukme " + trukme1 + ".");
		System.out.println("Pabaiga: " + h1 + ":" + min1);

	}

}
