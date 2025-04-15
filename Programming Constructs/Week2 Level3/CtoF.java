import java.util.Scanner;
public class CtoF { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter temperature in Celsius: ");
		double celsius = sc.nextDouble();
		double fahrenheit = (celsius * 9/5) + 32;
		System.out.println("The temperature " + celsius + "°C in Fahrenheit is " + fahrenheit + "°F");
		sc.close();
	}
}