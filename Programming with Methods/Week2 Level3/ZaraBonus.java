import java.util.Scanner;
public class ZaraBonus {
public static double[][] generateEmployeeData(Scanner scanner) {
double[][] employeeData = new double[10][2];
for (int i = 0; i < 10; i++) {
System.out.print("Enter salary for employee " + (i + 1) + ": ");
double salary = scanner.nextDouble();
System.out.print("Enter years of service for employee " + (i + 1) + ": ");
double yearsOfService = scanner.nextDouble();
employeeData[i][0] = salary;
employeeData[i][1] = yearsOfService;
}
return employeeData;
}
public static double[][] calculateNewSalaryAndBonus(double[][] employeeData) {
double[][] newSalaryAndBonus = new double[10][3];
for (int i = 0; i < 10; i++) {
double salary = employeeData[i][0];
double yearsOfService = employeeData[i][1];
double bonus = (yearsOfService > 5) ? salary * 0.05 : salary * 0.02;
double newSalary = salary + bonus;
newSalaryAndBonus[i][0] = salary;
newSalaryAndBonus[i][1] = newSalary;
newSalaryAndBonus[i][2] = bonus;
}
return newSalaryAndBonus;
}
public static void displayResults(double[][] employeeData, double[][] newSalaryAndBonus) {
double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
System.out.println("Employee | Old Salary | New Salary | Bonus");
for (int i = 0; i < 10; i++) {
double oldSalary = newSalaryAndBonus[i][0];
double newSalary = newSalaryAndBonus[i][1];
double bonus = newSalaryAndBonus[i][2];
totalOldSalary += oldSalary;
totalNewSalary += newSalary;
totalBonus += bonus;
System.out.printf("%8d | %10.2f | %10.2f | %6.2f\n", (i + 1), oldSalary, newSalary,
bonus);
}
System.out.println("\nTotal Old Salary: " + totalOldSalary);
System.out.println("Total New Salary: " + totalNewSalary);
System.out.println("Total Bonus: " + totalBonus);
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
double[][] employeeData = generateEmployeeData(scanner);
double[][] newSalaryAndBonus = calculateNewSalaryAndBonus(employeeData);
displayResults(employeeData, newSalaryAndBonus);
}
}