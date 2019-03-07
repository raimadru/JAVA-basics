import java.util.Scanner;

public class pirmas {

	public static void main(String[] args) {
		
		   Scanner in = new Scanner(System.in);
		   
		   double x = 25;
		   double y = 37;
		   double z = 29;
		   
		   System.out.println("Maziausia reiksme " + smallest(x,y,z) + "\n");
	}
	
	public static double smallest(double x, double y, double z) {
		
		   return Math.min(Math.min(x, y), z);
	}
}
