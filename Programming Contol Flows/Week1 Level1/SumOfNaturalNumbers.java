import java.util.Scanner;
public class SumOfNaturalNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		int total = 0;
		for (int i = 1; i <= n; i++) {
		total += i;
		}
		System.out.println("Total sum: " + total);
		sc.close();
	}
}