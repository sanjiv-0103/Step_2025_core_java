import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

       
        if (number >= 18) {
            
            System.out.println("The person is eligible to vote");
        } else {
            System.out.println("The person is not eligible to vote");
        }

        scanner.close();
    }
}
