import java.util.Random;
import java.util.Scanner;
public class StudentScores {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of students: ");
int numStudents = sc.nextInt();
int[][] scores = generateScores(numStudents);
double[][] result = calculateResults(scores);
displayScorecard(result, scores);
}
public static int[][] generateScores(int numStudents) {
Random rand = new Random();
int[][] scores = new int[numStudents][3];
for (int i = 0; i < numStudents; i++) {
for (int j = 0; j < 3; j++) {
scores[i][j] = rand.nextInt(90) + 10; // Generating random 2-digit numbers
}
}
return scores;
}
public static double[][] calculateResults(int[][] scores) {
double[][] result = new double[scores.length][4];
for (int i = 0; i < scores.length; i++) {
int total = 0;
for (int j = 0; j < 3; j++) {
total += scores[i][j];
}
double average = total / 3.0;
double percentage = (total / 300.0) * 100;
result[i][0] = total;
result[i][1] = average;
result[i][2] = percentage;
}
return result;
}
public static void displayScorecard(double[][] result, int[][] scores) {
System.out.println("Scorecard:");
System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
for (int i = 0; i < result.length; i++) {
System.out.print((i + 1) + "\t");
for (int j = 0; j < 3; j++) {
System.out.print(scores[i][j] + "\t");
}
System.out.print(Math.round(result[i][0]) + "\t");
System.out.print(Math.round(result[i][1] * 100.0) / 100.0 + "\t");
System.out.println(Math.round(result[i][2] * 100.0) / 100.0);
}
}
}