import java.util.Scanner;
public class Swap{
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enterfirst number: "); 
		int number1 = sc.nextInt();
		System.out.print("Entersecond number: "); 
		int number2 = sc.nextInt();
		int temp = number1; 
		number1 = number2; number2 = temp;
		System.out.println("The swapped numbers are " + number1 + " and " + number2); 
		sc.close();
	}
}