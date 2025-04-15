import java.util.Scanner;
class numbercheck {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int x = input.nextInt();
			int y = input.nextInt();
			int z = input.nextInt();
			if (x > y && x > z) {
			System.out.println(" Is the first number the smallest? YES ");
			}else{
			System.out.println(" Is the first number the smallest? NO");
			}
			input.close();
		}
}