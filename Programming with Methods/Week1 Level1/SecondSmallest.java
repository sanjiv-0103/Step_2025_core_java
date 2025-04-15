import java.util.Arrays;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] a = {1, 7, 4, 3, 5};

        int secondSmallest = findSecondSmallest(a);
        System.out.println("The second smallest element is: " + secondSmallest);
    }

    public static int findSecondSmallest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array must have at least two elements");
            return -1;
        }

        Arrays.sort(arr); // Sort the array
        return arr[1]; // Return the second element
    }
}
