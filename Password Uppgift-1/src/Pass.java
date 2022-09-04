import java.util.Scanner;

import org.xml.sax.SAXNotRecognizedException;

public class Pass {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Password ");
		String password = scan.nextLine();
		System.out.println("Your password is " + password);
		System.out.print("Enter Name ");
		String name = scan.nextLine();

		int i = 0;
		do {
			System.out.print("Hello " + " write your password to login: ");
			String attemp = scan.nextLine();

			if (attemp.equals(password)) {
				System.out.println("Hey " + name + "You have logged in");
				break;
			} else if (i == 2) {
				System.out.println("Too many attemps, LOCKED!");
			} else {
				System.out.println("Wrong Password try again");
			}

			i++;

		} while (i < 3);
		scan.close();

	}

}
