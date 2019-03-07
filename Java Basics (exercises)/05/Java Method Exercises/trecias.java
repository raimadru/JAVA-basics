import java.util.Scanner;

public class trecias {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int skc = 25;
		
		System.out.println("Suma: " + sumSkc(skc));
	}
	
	public static int sumSkc(long n) {
		
		int result = 0;
		
		while(n > 0) {
			result += n % 10;
			n /= 10;
			
		}
		
		return result;
	}

}
