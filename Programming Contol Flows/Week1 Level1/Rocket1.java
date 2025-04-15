import java.util.Scanner;
public class Rocket1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the countdown start value: ");
		int countdownValue = sc.nextInt();
		while (countdownValue >= 1) {
		System.out.println(countdownValue);
		countdownValue--;
		}
		System.out.println("Rocket Launching!");
		sc.close();
	}
}