import java.util.Scanner;
class check_divisible {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		if (x % 5 == 0) {
		System.out.println(" Is the number " + x + " divisible by 5? "+ "
		YES");
		}else{
		System.out.println("Is the number " + x + " divisible by 5? "+ " NO");
		}
		input.close();
	}
}