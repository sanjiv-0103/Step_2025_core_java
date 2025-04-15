import java.util.Scanner;
public class Weight {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		double weightPounds = sc.nextDouble();
		double weightKg = weightPounds / 2.2;
		System.out.printf("The weight of the person in pounds is %.2f and in kilograms is %.2f%n", weightPounds, weightKg);

		sc.close();
	}
}