import java.util.Scanner; public
class Square {
	public static void main(String[] args) { 
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the perimeter of the square: "); double
			perimeter = input.nextDouble();
			double side = perimeter / 4;
			System.out.println("The side of the square is " + side + " with a perimeter of " + perimeter);
			input.close();
	}
}