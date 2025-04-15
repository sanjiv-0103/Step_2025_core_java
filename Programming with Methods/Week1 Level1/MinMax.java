import java.util.Scanner;
public class MinMax {
	public static int[] findSmallestAndLargest(int a, int b, int c) {
		int smallest = Math.min(a, Math.min(b, c));
		int largest = Math.max(a, Math.max(b, c));
		return new int[]{smallest, largest};
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		int a = scanner.nextInt();

		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int[] result = findSmallestAndLargest(a, b, c);
		System.out.println("Smallest: " + result[0] + ", Largest: " + result[1]);
		scanner.close();
	}
}