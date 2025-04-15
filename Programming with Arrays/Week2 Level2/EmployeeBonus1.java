import java.util.Scanner;
class EmployeeBonus1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] salary = new double[10];
		double[] yearsOfService = new double[10];
		double[] bonus = new double[10];
		double[] newSalary = new double[10];

		double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

		for (int i = 0; i < 10; i++) {
			salary[i] = input.nextDouble();
			System.out.print("Enter years of service for employee " + (i + 1) + ": ");
			yearsOfService[i] = input.nextDouble();

			if (salary[i] < 0 || yearsOfService[i] < 0) {
				System.err.println("Invalid input. Please enter positive values.");
				i--;
			}
		}
		for (int i = 0; i < 10; i++) {
			if (yearsOfService[i] > 5) {
				bonus[i] = salary[i] * 0.05;
			} else {
				bonus[i] = salary[i] * 0.02;
			}

		newSalary[i] = salary[i] + bonus[i];

		totalBonus += bonus[i];
		totalOldSalary += salary[i];
		totalNewSalary += newSalary[i];
		}

		System.out.println("Total Bonus Payout: " + totalBonus);
		System.out.println("Total Old Salary: " + totalOldSalary);
		System.out.println("Total New Salary: " + totalNewSalary);
		input.close();
	}
}