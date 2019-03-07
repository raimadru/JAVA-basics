import java.util.Scanner;

public class antras {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double x = 25;
		double y = 45;
		double z = 65;
		
		System.out.println("Vidurkis yra: " + average(x, y, z) + "\n");

	}
	
	public static double average(double x, double y, double z) {
		
		return (x + y + z) / 3;
	}
}
