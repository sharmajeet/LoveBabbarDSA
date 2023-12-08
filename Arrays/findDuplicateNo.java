// 287. Find the Duplicate Number

import java.util.Arrays;
import java.util.Scanner;

public class findDuplicateNo {
    // optimal approch
    public static int optimalFind(int arr[], int size) {
        int ans = -1;
        for (int i = 0; i < size; i++) {
            int index = Math.abs(arr[i]);

            // else mark visited
            arr[index] = arr[index] * -1;

            // if alrady visistted?
            if (arr[index] < 0) {
                return index;
            }

        }
        return ans;
    }

    // sorting approch
    public static int isDuplicate(int arr[], int size) {
        Arrays.sort(arr);
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return arr[i];
            }
        }
        return -1;

    }

    public static void printArr(int arr[]) {
        System.out.println("Printing Array ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter Array Values ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Duplicate number : ");
        // System.out.println(isDuplicate(arr, size));
        System.out.println(optimalFind(arr, size));
        // printArr(arr);
    }

}
