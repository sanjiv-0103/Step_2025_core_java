import java.util.Scanner;
public class Division{
	public static void main(String[] args) { Scanner
		input = new Scanner(System.in);
		System.out.print("Enter first number: "); 
		int	number1 = input.nextInt();
		System.out.print("Entersecond number: "); 
		int number2 = input.nextInt();
		if (number2 != 0) {
		int quotient = number1 / number2;
		int remainder = number1 % number2;
		System.out.println("Quotient: " + quotient);
		System.out.println("Remainder: " + remainder);
		} else {
		System.out.println("Division by zero is not allowed.");

		}
		input.close();
	}
}
