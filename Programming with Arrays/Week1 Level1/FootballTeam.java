import java.util.Scanner;
public class FootballTeam {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the number of players in the football team: ");
			int numPlayers = scanner.nextInt();
			double[] heights = new double[numPlayers];
			System.out.println("Enter the heights of the " + numPlayers + " players:");
			for (int i = 0; i < numPlayers; i++) {
				System.out.print("Height of player " + (i + 1) + ": ");
				heights[i] = scanner.nextDouble();

			}
			double sum = 0;
			for (int i = 0); {
				i < numPlayers; i++) 
				sum += heights[i];
			}
		double meanHeight = sum / numPlayers;
		System.out.println("The mean height of the players is: " + meanHeight + " meters.");
		scanner.close();
	}
}