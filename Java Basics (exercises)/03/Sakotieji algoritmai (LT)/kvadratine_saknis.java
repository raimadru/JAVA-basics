import java.util.Scanner;

public class kvadratine_saknis {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Iveskite skaiciu:");
		int skaicius = input.nextInt();
		
		input.close();
		
		System.out.println(Math.sqrt(skaicius));

	}

}
