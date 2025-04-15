import java.util.Scanner;

public class EmpbonusCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter your years of service: ");
        int yearsOfService = input.nextInt();

        if (yearsOfService > 5) {
            double bonus = salary * 0.05; 
            System.out.println("Congratulations! You are eligible for a bonus.");
            System.out.println("Your bonus amount is: $" + bonus);
        } else {
            System.out.println("Sorry, you are not eligible for a bonus.");
        }

        input.close();
    }
}
