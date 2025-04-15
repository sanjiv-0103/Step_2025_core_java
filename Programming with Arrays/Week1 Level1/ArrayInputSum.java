import java.util.Scanner;

public class ArrayInputSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[10];
		int count = 0;
		int sum = 0;
		System.out.println("Enter numbers (up to 10), the program will stop when you enter 0 or a
		negative number:");
		while (count < 10) {
			System.out.print("Enter a number: ");
			int num = scanner.nextInt();
			if (num <= 0) {
				break;
				}
				numbers[count] = num;
				sum += num;
				count++;
		}
		System.out.println("\nNumbers entered:");
		for (int i = 0; i < count; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("\nSum of all numbers: " + sum);
		scanner.close();
	}
}