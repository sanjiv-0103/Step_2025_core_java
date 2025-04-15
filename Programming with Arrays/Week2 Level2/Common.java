import java.util.HashSet;

public class Common {
    public static void main(String[] args) {
        int[] a = {1, 5, 7, 2};
        int[] b = {3, 9, 8, 2};

        System.out.println("Common elements:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.println(a[i]);
                }
            }
        }
    }
}
