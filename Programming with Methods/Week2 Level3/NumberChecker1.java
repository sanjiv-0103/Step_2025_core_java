import java.util.Arrays;
public class NumberChecker1 {
public static int countDigits(int number) {
return Integer.toString(number).length();
}
public static int[] storeDigits(int number) {
int digitsCount = countDigits(number);
int[] digitsArray = new int[digitsCount];
for (int i = digitsCount - 1; i >= 0; i--) {
digitsArray[i] = number % 10;
number /= 10;
}
return digitsArray;
}
public static int[] reverseDigits(int[] digitsArray) {
int[] reversedArray = new int[digitsArray.length];
for (int i = 0; i < digitsArray.length; i++) {
reversedArray[i] = digitsArray[digitsArray.length - 1 - i];
}
return reversedArray;
}
public static boolean areArraysEqual(int[] array1, int[] array2) {
if (array1.length != array2.length) {
return false;
}
for (int i = 0; i < array1.length; i++) {
if (array1[i] != array2[i]) {
return false;
}
}
return true;
}
public static boolean isPalindrome(int number) {
int[] digitsArray = storeDigits(number);
int[] reversedArray = reverseDigits(digitsArray);
return areArraysEqual(digitsArray, reversedArray);
}
public static boolean isDuckNumber(int number) {
int[] digitsArray = storeDigits(number);
for (int digit : digitsArray) {
if (digit != 0) {
return true;
}
}
return false;
}
public static void main(String[] args) {
int number = 12321;
System.out.println("Count of digits: " + countDigits(number));
int[] digitsArray = storeDigits(number);
System.out.print("Digits in the array: ");
for (int digit : digitsArray) {
System.out.print(digit + " ");
}
System.out.println();
int[] reversedArray = reverseDigits(digitsArray);
System.out.print("Reversed digits array: ");
for (int digit : reversedArray) {
System.out.print(digit + " ");
}
System.out.println();
System.out.println("Is Palindrome: " + isPalindrome(number));
System.out.println("Is Duck Number: " + isDuckNumber(number));
}
}