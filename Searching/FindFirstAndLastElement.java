// 34. Find First and Last Position of Element in Sorted Array
// Medium
// Topics
// Companies
// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
// If target is not found in the array, return [-1, -1].
// You must write an algorithm with O(log n) runtime complexity.
// Example 1:
// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
// Example 2:
// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]

import java.util.Arrays;

public class FindFirstAndLastElement {
    public static int[] find(int arr[], int target) {

        int first = findFirst(arr, target);
        int last = findLast(arr, target);
        return new int[] { first, last };

    }

    public static int findFirst(int arr[], int target) {
        int first = -1;
        int start = 0;
        int end = arr.length - 1;
        // int mid = start + (end - start) / 2;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                first = mid;
                end = mid - 1;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return first;
    }

    public static int findLast(int arr[], int target) {
        int last = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                last = mid;
                start = mid + 1;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return last;
    }

    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,6,6,6 };
        int target = 6;
        // for(int i=0;i<)
        int result[] = find(arr, target);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
