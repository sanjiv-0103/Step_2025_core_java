import java.util.Scanner;

public class SecLarge {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        
        int largest = Integer.minval;
        int secondLargest = Integer.minval;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Second largest number: " + secondLargest);
    }
}
