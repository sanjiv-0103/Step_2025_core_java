import java.util.Scanner;

public class Consecutive {
    public static boolean three(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 3 && nums[i + 1] == 3) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 1};
        System.out.println(three(arr));
    }
}
