import java.util.Scanner;

public class pazymiai {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Ivesta: ");
		int a = input.nextInt();

		switch (a) {

		case 10:
			System.out.println("Gauta: Puikiai");
			break;
		case 9:
			System.out.println("Gauta: Labai gerai");
			break;
		case 8:
			System.out.println("Gauta: Gerai");
			break;
		case 7:
			System.out.println("Gauta: Vidutiniskai");
			break;
		default:
			System.out.println("Gauta: Reikia daugiau pastangu");
		}

		input.close();
	}

}
