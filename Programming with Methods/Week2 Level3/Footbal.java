import java.util.Random;
public class Footbal {
	public static int findSum(int[] heights) {
	int sum = 0;
	for (int height : heights) {
		sum += height;
	}
	return sum;
	}
	public static double findMean(int[] heights) {
		int sum = findSum(heights);
		return (double) sum / heights.length;
	}
	public static int findShortestHeight(int[] heights) {
		int shortest = heights[0];
		for (int height : heights) {
			if (height < shortest) {
				shortest = height;
			}
		}
		return shortest;
	}
	public static int findTallestHeight(int[] heights) {
		int tallest = heights[0];
		for (int height : heights) {
			if (height > tallest) {
				tallest = height;
			}
		}
		return tallest;
	}
	public static void main(String[] args) {
		int[] heights = new int[11];
		Random random = new Random();
		for (int i = 0; i < heights.length; i++) {
			heights[i] = random.nextInt(101) + 150;
		}
		int sum = findSum(heights);
		double mean = findMean(heights);
		int shortest = findShortestHeight(heights);
		int tallest = findTallestHeight(heights);
		System.out.println("Heights of players in cms:");
		for (int height : heights) {
			System.out.print(height + " ");
		}
		System.out.println("\n\nResults:");
		System.out.println("Sum of heights: " + sum + " cms");
		System.out.println("Mean height: " + mean + " cms");
		System.out.println("Shortest height: " + shortest + " cms");
		System.out.println("Tallest height: " + tallest + " cms");
	}
}