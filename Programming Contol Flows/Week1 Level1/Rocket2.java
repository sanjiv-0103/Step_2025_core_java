import java.util.Scanner;
public class Rocket2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the countdown start value: ");
		int countdownValue = sc.nextInt();

		for (int i = countdownValue; i >= 1; i--) {
		System.out.println(i);
		}
		System.out.println("Rocket Launching!");
		sc.close();
	}
}