import java.util.Scanner;
public class SumOfNatural {
	public static int recursiveSum(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n + recursiveSum(n - 1);}
		}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number n to find the sum of first n natural numbers: ");
		int n = scanner.nextInt();
		int recursiveResult = recursiveSum(n);
		int formulaResult = n * (n + 1) / 2;
		System.out.println("Sum using recursive method: " + recursiveResult);
		System.out.println("Sum using formula n * (n + 1) / 2: " + formulaResult);
		if (recursiveResult == formulaResult) {
			System.out.println("Both results are correct and equal.");
		} else {
			System.out.println("The results do not match! Something went wrong.");
		}
		scanner.close();
	}
}