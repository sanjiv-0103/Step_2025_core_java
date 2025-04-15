import java.util.Scanner;
import java.util.Scanner;
public class Friend {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Amar's age: ");
		int amarAge = scanner.nextInt();
		System.out.print("Enter Amar's height (in cm): ");
		int amarHeight = scanner.nextInt();
		System.out.print("Enter Akbar's age: ");
		int akbarAge = scanner.nextInt();
		System.out.print("Enter Akbar's height (in cm): ");
		int akbarHeight = scanner.nextInt();
		System.out.print("Enter Anthony's age: ");
		int anthonyAge = scanner.nextInt();
		System.out.print("Enter Anthony's height (in cm): ");
		int anthonyHeight = scanner.nextInt();
		String youngest = "Amar";
		int youngestAge = amarAge;
		if (akbarAge < youngestAge) {
			youngest = "Akbar";
			youngestAge = akbarAge;
		}
		if (anthonyAge < youngestAge) {
			youngest = "Anthony";
			youngestAge = anthonyAge;
		}
		String tallest = "Amar";
		int tallestHeight = amarHeight;
		if (akbarHeight > tallestHeight) {
			tallest = "Akbar";
			tallestHeight = akbarHeight;
		}
		if (anthonyHeight > tallestHeight) {
			tallest = "Anthony";
			tallestHeight = anthonyHeight;
		}
		System.out.println("\nThe youngest friend is " + youngest + " with age " + youngestAge + ".");
		System.out.println("The tallest friend is " + tallest + " with height " + tallestHeight + " cm.");
		scanner.close();
	}
}