import java.util.Scanner;
public class Travel {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.next();
		System.out.print("Enter departure city: ");
		String fromCity = sc.next();
		System.out.print("Enter via city: ");
		String viaCity = sc.next();
		System.out.print("Enter destination city: ");
		String toCity = sc.next();
		System.out.print("Enter distance from departure to via city in miles: "); double
		fromToVia = sc.nextDouble();
		System.out.print("Enter distance from via city to destination in miles: "); double
		viaToFinalCity = sc.nextDouble();
		double totalDistance = fromToVia + viaToFinalCity;
		System.out.print("Enter total time taken in hours: ");
		double timeTaken = sc.nextDouble();
		System.out.println(name + " traveled from " + fromCity + " to " + toCity + " via" + viaCity + ", covering " + totalDistance + " milesin " + timeTaken + " hours.");

		sc.close();
	}
}