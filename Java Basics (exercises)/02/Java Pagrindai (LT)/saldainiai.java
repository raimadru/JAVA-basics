import java.util.Scanner;

public class saldainiai {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Mokytoja nupirko saldainiu: ");
		int m = input.nextInt();
		
		System.out.println("Olimpiadoje dalyvavo devintoku: ");
		int n = input.nextInt();
		
		// m>n, isdalinta mokiniams po lygiai
		
		if(m != 0) {
			int poSaldainiuMokiniams = m / n;
			int mokytojaiLieka = m % poSaldainiuMokiniams;
			
			input.close();
		
		System.out.println("Mokiniai gauna po: " + poSaldainiuMokiniams);
		System.out.println("Mokytojai lieka: " + mokytojaiLieka);
		
		}

	}

}
