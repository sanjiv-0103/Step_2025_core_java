import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter " + n1 + " elements for first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
		System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter " + n2 + " elements for second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        List<Integer> common = CommonElements(arr1, arr2);

        System.out.println("Common elements: " + common);
		sc.close();
    }
	
	public static List<Integer> CommonElements(int[] a, int[] b) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int num : a) {
            set1.add(num);
        }
        for (int num : b) {
            if (set1.contains(num)) {
                result.add(num);
            }
        }
        return new ArrayList<>(result);
    }
}