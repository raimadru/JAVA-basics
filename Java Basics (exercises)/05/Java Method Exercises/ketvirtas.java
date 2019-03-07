import java.util.Scanner;

public class ketvirtas {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Metai: ");
		
		int metai = 2017; // in.nextInt();
		System.out.println(metai);
		
		System.out.println(yraMetai(metai));
	}
	
	public static boolean yraMetai(int i) {
		
		boolean a = (i % 4) == 0;
		boolean b = (i % 100) != 0;
		boolean c = (i % 100 == 0) && (i % 400 == 0);
		
		return a && (b || c);
	}

}
