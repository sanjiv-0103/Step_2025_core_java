import java.util.Scanner; 
public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the principal amount: ");
		double principal = sc.nextDouble();
		System.out.print("Enter the rate of interest: "); 
		double rate = sc.nextDouble(); System.out.print("Enter the
		time in years: "); double time = sc.nextDouble();
		double simpleInterest = (principal * rate * time) / 100;
		System.out.println("The Simple Interest is " + simpleInterest +" for Principal " + principal +", Rate of Interest " + rate + ", and Time " + time);
		sc.close();
	}
}