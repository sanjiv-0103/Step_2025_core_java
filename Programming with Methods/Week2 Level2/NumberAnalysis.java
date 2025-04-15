import java.util.Scanner;
public class NumberAnalysis {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[5]; // Array to store 5 numbers
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			numbers[i] = scanner.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			System.out.print("Number " + (i + 1) + " (" + numbers[i] + "): ");
			if (numbers[i] > 0) {
				System.out.println("It is positive.");
				if (numbers[i] % 2 == 0) {
					System.out.println("It is an even number.");
				} else {
					System.out.println("It is an odd number.");
				}
			} else if (numbers[i] < 0) {
				System.out.println("It is negative.");
			} else {
				System.out.println("It is zero.");
			}
		}
		int firstElement = numbers[0];
		int lastElement = numbers[4];
		System.out.print("\nComparing the first (" + firstElement + ") and last (" +
		lastElement + ") elements: ");
		if (firstElement == lastElement) {
			System.out.println("They are equal.");
		} else if (firstElement > lastElement) {
			System.out.println("The first element is greater.");
		} else {
			System.out.println("The last element is greater.");
		}
		scanner.close();
	}
}