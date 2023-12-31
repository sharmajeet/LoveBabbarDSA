package Recursion;

public class IsSorted {
    public static void main(String[] args) {
        int arr[] = new int[] { 11, 22, 33, 44, 99, 777 };
        int i = 0;
        int len = arr.length;
        boolean ans = issorted(arr, i, len);
        if (ans) {
            System.out.println("Array is alrady sorted");
        } else {
            System.out.println("Array is not sorted.");
        }
    }

    public static boolean issorted(int[] arr, int i, int len) {
        // base case
        if (i == arr.length - 1) {
            return true;
        }

        // main logic
        if (arr[i + 1] < arr[i]) {
            return false;
        }

        // recusrion
        return issorted(arr, i + 1, len);
    }
}
