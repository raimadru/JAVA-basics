import java.util.Scanner;

public class graza {

	public static void main(String[] args) {
		
		// gaunama centais
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Gaunama centu: ");
		int ct = input.nextInt();
		System.out.println("Gauta: " + ct + " ct");
		
		// kiek centu bus is viso
		
		double ctg = ct / 3.45;
		System.out.println("Is viso euro centu: " + ctg);
		
		// kiek euro pinigu
		
		int eg = (int) (ctg / 100);
		int centai = (int) (ctg % 100);
		
		input.close();
		
		System.out.println("Suma eurais: " + eg + " eur " + centai + " ct");

	}

}
