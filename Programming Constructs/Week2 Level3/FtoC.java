import java.util.Scanner;
public class FtoC { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); System.out.print("Enter
		temperature in Fahrenheit: "); double fahrenheit =
		sc.nextDouble();
		double celsius = (fahrenheit - 32) * 5/9;
		System.out.println("The temperature " + fahrenheit + "°F in Celsius is " + celsius + "°C"); sc.close();
	}
}