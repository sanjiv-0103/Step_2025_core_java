import java.util.Scanner;
public class VotingEligibility {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
			System.out.print("Enter the age of student " + i + ": ");
			int age = scanner.nextInt();
			if (age >= 18) {
				System.out.println("Student " + i + " is eligible to vote.");
			} else {
			System.out.println("Student " + i + " is not eligible to vote.");
			}
		}
		scanner.close();
	}
}