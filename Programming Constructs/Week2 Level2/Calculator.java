import java.util.Scanner; public
class Calculator {
	public static void main(String[] args) { 
		Scanner	input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		double number1 = input.nextDouble();
		System.out.print("Entersecond number: "); 
		double number2 = input.nextDouble();
		System.out.println("Addition: " + (number1 + number2)); 
		System.out.println("Subtraction: " +(number1 - number2)); 
		System.out.println("Multiplication: " + (number1 * number2));
		System.out.println("Division: " + (number2 != 0 ? (number1 / number2) : "Undefined"));
		input.close();
	}
}