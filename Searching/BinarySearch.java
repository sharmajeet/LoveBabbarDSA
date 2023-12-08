// package Searching;

public class BinarySearch {
    public static void search(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            if (arr[mid] == target) {
                System.out.println("Element found at index : " + mid);
            }
            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 11, 22, 33, 44, 55, 66, 77, 99 };
        
        int target = 55;
        search(arr, target);
    }
}