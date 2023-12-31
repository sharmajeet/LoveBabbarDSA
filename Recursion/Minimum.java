package Recursion;

public class Minimum {
    public static void main(String[] args) {
        int arr[] = new int[] { 11, 222, 3, 35, 5, 55, 565, 59 };
        int i = 0;
        int len = arr.length;
        int min[] = new int[] { Integer.MAX_VALUE };

        // method call
        findMinimum(arr, i, len, min);
        System.out.println("minimum value is : " + min[0]);
    }

    public static void findMinimum(int[] arr, int i, int len, int[] min) {
        if (i >= len) {
            return;
        }

        // recursion

        if (arr[i] < min[0]) {
            min[0] = arr[i];
        }

        findMinimum(arr, i + 1, len, min);
    }
}
