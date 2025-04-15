import java.util.Scanner;

public class DiscountFee {
	public static void main(String[] args) { Scanner
		input = new Scanner(System.in);
		System.out.print("Enter course fee: ");
		double fee = input.nextDouble();
		System.out.print("Enter discount percentage: ");
		double discountPercent = input.nextDouble(); double
		discount = (discountPercent / 100) * fee; double
		finalFee = fee - discount;
		System.out.println("The discount amount is INR " + discount + "
		and the final discounted fee is INR " + finalFee);
		input.close();
	}
}