import java.util.Scanner;
public class Chocolate {
	public static int[] distributeChocolates(int chocolates, int children) {
		return new int[]{chocolates / children, chocolates % children};
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of chocolates: ");
		int chocolates = scanner.nextInt();
		System.out.print("Enter number of children: ");
		int children = scanner.nextInt();
		int[] result = distributeChocolates(chocolates, children);
		System.out.println("Each child gets: " + result[0] + " chocolates, Remaining chocolates: " + result[1]);
		scanner.close();
	}
}