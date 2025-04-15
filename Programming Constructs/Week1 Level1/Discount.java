import java.util.Scanner

public class Discount {
	public static void main(String[] args) { double
		fee = 125000, discountPercent = 10;
		double discount = (discountPercent/ 100) * fee;
		double finalFee = fee - discount;
		System.out.println("The discount amount is INR " + discount + "
		and the final discounted fee is INR " + finalFee);

	}
}