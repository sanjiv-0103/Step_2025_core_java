import java.util.Scanner;
public class TotalIncome {
	public static void main(String[] args) { Scanner
		sc = new Scanner(System.in);
		System.out.print("Enter salary in INR: ");
		double salary = sc.nextDouble();
		System.out.print("Enter bonusin INR: ");

		double bonus = sc.nextDouble(); double
		totalIncome = salary + bonus;
		System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence,

		Total Income is INR " + totalIncome);

		sc.close();
	}
}