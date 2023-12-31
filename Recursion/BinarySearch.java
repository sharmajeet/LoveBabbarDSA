package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[] { 11, 55, 56, 88, 99, 107 };
        int len = arr.length;
        int start = 0;
        int end = len - 1;
        int target = 107;

        System.out.println(find(arr, target, start, end));
    }

    public static int find(int[] arr, int target, int start, int end) {
        int mid = start + (end - start) / 2;
        // base cases
        if (start > end) {
            return -1;
        }

        if (arr[mid] == target) {
            return mid;
        }

        // recursive calls
        if (arr[mid] > target) {
            return find(arr, target, start, mid - 1);
        } else {
            return find(arr, target, mid + 1, end);
        }
    }

}