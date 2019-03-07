import java.util.Scanner;

public class kampas {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Iveskite kampo laipsnius");
		int lai = input.nextInt();

		if (lai == 90) {
			System.out.println("Kampas statusis");

		} else if (lai == 180) {
			System.out.println("Kampas istiestinis");

		} else if (lai == 360) {
			System.out.println("Kampas pilnutinis");

		} else if (lai < 0) {
			System.out.println("Skaicius turi buti teigiamas");

		} else {
			System.out.println("Pavadinimo nera");

		}

		input.close();
	}

}
