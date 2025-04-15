import java.util.Scanner;
class BMICalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of persons: ");
		int numberOfPersons = input.nextInt();
		double[][] personData = new double[numberOfPersons][3];
		String[] weightStatus = new String[numberOfPersons];
		for (int i = 0; i < numberOfPersons; i++) {
			System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
			personData[i][0] = input.nextDouble();
			System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
			personData[i][1] = input.nextDouble();
			if (personData[i][0] <= 0 || personData[i][1] <= 0) {
				System.err.println("Invalid input. Please enter positive values.");
				i--;
				continue;
			}
			personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);
			if (personData[i][2] < 18.5) {
				weightStatus[i] = "Underweight";
			} else if (personData[i][2] < 24.9) {
				weightStatus[i] = "Normal weight";
			} else if (personData[i][2] < 29.9) {
				weightStatus[i] = "Overweight";
			} else {
				weightStatus[i] = "Obesity";
			}
		}
		System.out.println("\nPerson Details:");
		for (int i = 0; i < numberOfPersons; i++) {
			System.out.println("Person " + (i + 1) + " - Height: " + personData[i][0] + " m, Weight: " +
			personData[i][1] + " kg, BMI: " + personData[i][2] + ", Status: " + weightStatus[i]);
		}
		input.close();
	}
}