import java.util.Scanner;
public class Voting {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
			System.out.print("Enter age of student " + i + ": ");
			int age = scanner.nextInt();
			if (age >= 18) {
				System.out.println("Student " + i + " can vote.");
			} else {
				System.out.println("Student " + i + " cannot vote.");
			}
		}
		scanner.close();
	}
}