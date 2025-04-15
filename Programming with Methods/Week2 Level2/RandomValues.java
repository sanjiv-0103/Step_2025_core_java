import java.util.Scanner;
public class RandomValues {
	public static void main(String[] args) {
		int[] randomValues = new int[5];
		for (int i = 0; i < 5; i++) {
			randomValues[i] = (int)(Math.random() * 9000) + 1000
			System.out.println("Random Value " + (i + 1) + ": " + randomValues[i]);
		}
		int sum = 0;
		for (int value : randomValues) {
			sum += value;
		}
		double average = sum / 5.0;
		int minValue = randomValues[0];
		int maxValue = randomValues[0];
		for (int value : randomValues) {
			minValue = Math.min(minValue, value);
			maxValue = Math.max(maxValue, value);
		}
		System.out.println("Average value: " + average);
		System.out.println("Minimum value: " + minValue);
		System.out.println("Maximum value: " + maxValue);
	}
}