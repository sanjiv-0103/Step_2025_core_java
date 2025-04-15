import java.util.HashSet;
public class Repeat {
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};
        
        System.out.println("Repeating numbers in the array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break; 
                }
            }
        }
    }
}
