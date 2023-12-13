import java.util.Arrays;

public class MaxProductOfTwoArrElements {
    public static void main(String[] args) {
        int arr[] = new int[]{3,4,5,2};
        System.out.println("Max Total : " + maxProduct(arr));
    }

    public static int maxProduct(int[] arr) {
        int len = arr.length;

        Arrays.sort(arr);
        int revArr[] = new int[len];

        for (int i = len - 1; i >= 0; i--) {
            revArr[len - 1 - i] = arr[i];
        }

        // System.out.println("Reversed Array:");
        // for (int i = 0; i < len; i++) {
        // System.out.println(revArr[i]);
        // }
        int curr = 0;
        int first = revArr[curr] - 1;
        int second = revArr[curr + 1] - 1;
        int max = first * second;
        return max;
    }
}
