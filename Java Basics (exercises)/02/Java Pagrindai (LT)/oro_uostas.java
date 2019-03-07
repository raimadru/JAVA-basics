import java.util.Scanner;

public class oro_uostas {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Iveskite pakilimo valanda: ");
		int h = input.nextInt();
		
		System.out.println("Iveskite pakilimo minutes: ");
		int min = input.nextInt();
		
		System.out.println("Iveskite trukme: ");
		int truk = input.nextInt(); // trukme minutemis
		
		// lektuvas nusileido
		
		
		int minutes = (truk % 60);
		int min1 = min + minutes;
			
		int h1 = h + (truk / 60);
		
		input.close();
	
		System.out.println("Lektuvas isskrido: " + h + " val " + min + " min");
		System.out.println("Lektuvas nusileido: " + h1 + " val " + min1 + " min");

	}

}
