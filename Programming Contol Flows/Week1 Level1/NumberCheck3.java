import java.util.Scanner;
public class NumberCheck3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		if (number > 0) {
			System.out.println("Positive");
		} else if (number < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("Zero");
		}
		input.close();
	}
}