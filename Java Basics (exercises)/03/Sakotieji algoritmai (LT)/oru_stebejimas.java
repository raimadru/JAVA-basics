import java.util.Scanner;

public class oru_stebejimas {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Iveskite skaiciu:");
		int a = input.nextInt();

		switch (a) {

		case 1:
			System.out.println("Sauleta");
			break;
		case 2:
			System.out.println("Lietinga");
			break;
		case 3:
			System.out.println("Vejuota");
			break;
		case 4:
			System.out.println("Sniegas");
			break;
		}

		input.close();

	}

}
