import java.util.Scanner;
public class Division {
	public static int[] findQuotientAndRemainder(int number, int divisor) {
		return new int[]{number / divisor, number % divisor};
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter dividend: ");
		int number = scanner.nextInt();
		System.out.print("Enter divisor: ");
		int divisor = scanner.nextInt();
		int[] result = findQuotientAndRemainder(number, divisor);
		System.out.println("Quotient: " + result[0] + ", Remainder: " + result[1]);
		scanner.close();
	}
}