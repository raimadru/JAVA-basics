import java.util.Scanner;

public class metu_laikas {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Iveskite menesi:");
		int a = input.nextInt();

		switch (a) {

		case 1:
			System.out.println("Sausis");
			break;
		case 2:
			System.out.println("Vasaris");
			break;
		case 3:
			System.out.println("Kovas");
			break;
		case 4:
			System.out.println("Balandis");
			break;
		case 5:
			System.out.println("Geguze");
			break;
		case 6:
			System.out.println("Birzelis");
			break;
		case 7:
			System.out.println("Liepa");
			break;
		case 8:
			System.out.println("Rugpjutis");
			break;
		case 9:
			System.out.println("Rugsejis");
			break;
		case 10:
			System.out.println("Spalis");
			break;
		case 11:
			System.out.println("Lapkritis");
			break;
		case 12:
			System.out.println("Gruodis");
			break;
		}

		if (a == 12 || a == 1 || a == 2) {
			System.out.println("Pasirinktas menuo yra ziema");

		} else if (a == 3 || a == 4 || a == 5) {
			System.out.println("Pasirinktas menuo yra pavasario menuo");

		} else if (a == 6 || a == 7 || a == 8) {
			System.out.println("Pasirinktas menuo yra vasara");

		} else {
			System.out.println("Pasirinktas menuo yra rudens menuo");
		}

		input.close();

	}

}
