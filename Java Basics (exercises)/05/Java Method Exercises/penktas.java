import java.util.Scanner;

public class penktas {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int pirmas = 10; // nextDouble()
		System.out.println("pirmas skaicius: " + pirmas);
		
		int antras = 15;
		System.out.println("Antras skaicius: " + antras);
		
		int trecias = 20;
		System.out.println("Trecias skaicius: " + trecias);
		
		
		System.out.println("Trikampio plotas lygus: " + plotas(pirmas, antras, trecias));

	}
	// reikia apskaiciuoti trikampio plota pagal formule
	
	public static boolean trikampis(double pirmas, double antras, double trecias) {
		
		if( pirmas + antras > trecias && antras + trecias > pirmas && pirmas + trecias > antras)
			return true;
			
		else return false;
	}
	
	public static double plotas(double pirmas, double antras, double trecias) {
		
		double R = 0;
		double s = (pirmas + antras + trecias) / 2; 
		
		R = Math.sqrt(s*(s - pirmas)*(s - antras)*(s - trecias));
		
		return R;
	}

}
