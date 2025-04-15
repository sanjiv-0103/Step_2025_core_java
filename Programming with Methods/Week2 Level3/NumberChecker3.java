import java.util.Scanner;
public class NumberChecker3 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = scanner.nextInt();
int[] factors = findFactors(number);
System.out.println("Factors of " + number + ": ");
for (int factor : factors) {
if (factor != 0) {
System.out.print(factor + " ");
}
}
System.out.println();
System.out.println("Greatest factor: " + greatestFactor(factors));
System.out.println("Sum of factors: " + sumOfFactors(factors));
System.out.println("Product of factors: " + productOfFactors(factors));
System.out.println("Product of cube of factors: " + productOfCubeOfFactors(factors));
System.out.println("Is perfect number: " + isPerfect(number));
System.out.println("Is abundant number: " + isAbundant(number));
System.out.println("Is deficient number: " + isDeficient(number));
System.out.println("Is strong number: " + isStrong(number));
scanner.close();
}
public static int[] findFactors(int number) {
int[] factors = new int[number];
int count = 0;
for (int i = 1; i <= number; i++) {
if (number % i == 0) {
factors[count++] = i;
}
}
return factors;
}
public static int greatestFactor(int[] factors) {
int greatest = 0;
for (int factor : factors) {
if (factor != 0 && factor > greatest) {
greatest = factor;
}
}
return greatest;
}
public static int sumOfFactors(int[] factors) {
int sum = 0;
for (int factor : factors) {
if (factor != 0) {
sum += factor;
}
}
return sum;
}
public static int productOfFactors(int[] factors) {
int product = 1;
for (int factor : factors) {
if (factor != 0) {
product *= factor;
}
}
return product;
}
public static double productOfCubeOfFactors(int[] factors) {
double product = 1;
for (int factor : factors) {
if (factor != 0) {
product *= Math.pow(factor, 3);
}
}
return product;
}
public static boolean isPerfect(int number) {
int sum = 0;
int[] factors = findFactors(number);
for (int factor : factors) {
if (factor != 0 && factor != number) {
sum += factor;
}
}
return sum == number;
}
public static boolean isAbundant(int number) {
int sum = 0;
int[] factors = findFactors(number);
for (int factor : factors) {
if (factor != 0 && factor != number) {
sum += factor;
}
}
return sum > number;
}
public static boolean isDeficient(int number) {
int sum = 0;
int[] factors = findFactors(number);
for (int factor : factors) {
if (factor != 0 && factor != number) {
sum += factor;
}
}
return sum < number;
}
public static boolean isStrong(int number) {
int sum = 0;
int temp = number;
while (temp != 0) {
int digit = temp % 10;
sum += factorial(digit);
temp /= 10;
}
return sum == number;
}
public static int factorial(int n) {
int fact = 1;
for (int i = 1; i <= n; i++) {
fact *= i;
}
return fact;
}
}