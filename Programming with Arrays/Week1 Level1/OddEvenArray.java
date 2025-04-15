import java.util.ArrayList;
import java.util.Scanner;
public class OddEvenArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			System.out.print("Enter a number: ");
			int num = scanner.nextInt();
			ArrayList<Integer> evenNumbers = new ArrayList<>();
			ArrayList<Integer> oddNumbers = new ArrayList<>();
			for (int i = 1; i <= num; i++) {
				if (i % 2 == 0) {
					evenNumbers.add(i);
				} else {
					oddNumbers.add(i);
				}
			}

			System.out.println("Even numbers between 1 and " + num + ": " + evenNumbers);
			System.out.println("Odd numbers between 1 and " + num + ": " + oddNumbers);
			scanner.close();
	}
}