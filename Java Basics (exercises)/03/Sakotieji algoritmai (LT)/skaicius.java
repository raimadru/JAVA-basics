import java.util.Scanner;

public class skaicius {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Ivesta:");
		int sk = input.nextInt();

		if (sk > 0) {
			System.out.println("Skaicius yra teigiamas");

		} else if (sk == 0) {
			System.out.println("SKicius lygus 0");

		} else {
			System.out.println("Skaicius yra neigiamas");
		}

		input.close();
	}

}
