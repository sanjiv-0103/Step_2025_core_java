import java.util.Scanner;
public class Double {
	public static void main(String[] args) { Scanner
		input = new Scanner(System.in);
		System.out.print("Enter value of a: "); 
		double a= input.nextDouble();
		System.out.print("Enter value of b: "); 
		double b = input.nextDouble();
		System.out.print("Enter value of c: "); 
		double c = input.nextDouble();
		double result1 = a + b * c;
		double result2 = a * b + c;
		double result3 = c + a / b;
		double result4 = a % b + c;
		System.out.println("Results:"); 
		System.out.println("a+ b * c = " + result1); 
		System.out.println("a * b + c = "+ result2); 
		System.out.println("c + a / b = " + result3);
		System.out.println("a % b + c = " + result4);
		input.close();
	}
}