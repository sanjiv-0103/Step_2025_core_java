import java.util.Scanner;
	public class Height {
		public static void main(String[] args) { Scanner
		input = new Scanner(System.in);
		System.out.print("Enter height in cm: ");
		double cm = input.nextDouble();
		double inches = cm / 2.54; double
		feet = inches / 12;
		System.out.println("Your Height in cm is " + cm + "
		while in feet is " + (int)feet +
		" and inches is " + (inches % 12));
		input.close();
	}
}