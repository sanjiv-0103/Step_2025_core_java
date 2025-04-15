import java.util.Scanner;
public class Purchase { 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter unit price: ");
		double unitPrice = input.nextDouble();
		System.out.print("Enter quantity: "); 
		int quantity = input.nextInt();
		double totalPrice = unitPrice * quantity; 
		System.out.println("Total purchase price: INR " + totalPrice);
		input.close();
	}
}