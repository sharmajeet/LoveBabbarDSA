package Recursion;

public class Maximum {
    public static void main(String[] args) {
        int arr[] = new int[] { 11, 55, 3, 2, 6, 2, 56, 511, 1515, 554 };

        int n = arr.length;

        // int maxi = Integer.MIN_VALUE;\ --maxi value is passed as a refrence varaible to next method..
        int[] maxi = new int[] { Integer.MIN_VALUE };

        int i = 0;
        findmax(arr, n, i, maxi);
        System.out.println(maxi[0]);
    }

    public static void findmax(int[] arr, int n, int i, int[] maxi) {
        // base case
        if (i >= n) {
            return;

        }

        if (arr[i] > maxi[0]) {
            maxi[0] = arr[i];
        }

        findmax(arr, n, i + 1, maxi);
    }
}
