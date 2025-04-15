import java.util.Scanner;
class MarksAndGrade {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numberOfStudents = input.nextInt();
		double[][] marks = new double[numberOfStudents][3];
		double[] percentages = new double[numberOfStudents];
		String[] grades = new String[numberOfStudents];
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.print("Enter marks for Physics: ");
			marks[i][0] = input.nextDouble();
			System.out.print("Enter marks for Chemistry: ");
			marks[i][1] = input.nextDouble();
			System.out.print("Enter marks for Maths: ");
			marks[i][2] = input.nextDouble();
		if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
			System.err.println("Invalid input. Please enter positive marks.");
			i--;
			continue;
		}
		percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;
		if (percentages[i] >= 90) {
			grades[i] = "A";

		} else if (percentages[i] >= 75) {
			grades[i] = "B";
		} else if (percentages[i] >= 50) {
			grades[i] = "C";
		} else {
			grades[i] = "D";
		}
		}
		System.out.println("\nStudent Details:");
		for (int i = 0; i < numberOfStudents; i++) {
				System.out.println("Student " + (i + 1) + " - Physics: " + marks[i][0] + ", Chemistry: " +
				marks[i][1] + ", Maths: " + marks[i][2] + ", Percentage: " + percentages[i] + ", Grade: " +
				grades[i]);
		}
	input.close();
	}
}