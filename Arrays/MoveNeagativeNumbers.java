import java.util.Arrays;
import java.util.Scanner;

public class MoveNeagativeNumbers {
    public static void sort(int arr[]) {
        Arrays.sort(arr);
        printArr(arr);
    }

    public static void moveNumbers(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            if (arr[start] < 0) {
                start++;
            } else if (arr[end] > 0) {
                end--;
            } else {
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
                start++;
                end--;
            }
        }
        printArr(arr);
    }

    public static void printArr(int arr[]) {
        System.out.println("Array looks Like");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array length : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array Values ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        moveNumbers(arr);
        // sort(arr);
    }

}
