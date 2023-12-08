import java.util.Arrays;
import java.util.Scanner;

public class SortColors {
    // optimal approch - 3pointer approch
    public static void optimalSort(int arr[]) {
        int low = 0, mid = 0;
        int high = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                if (arr[mid] == 2) {
                    int temp = arr[high];
                    arr[high] = arr[mid];
                    arr[mid] = temp;
                    high--;
                }
            }
        }
        printArr(arr);
    }

    // 1st approch with sorting method
    public static void sortColors(int arr[]) {
        Arrays.sort(arr);
        printArr(arr);

    }

    // 2nd approch using count method
    public static void sortUsingCount(int arr[]) {
        int zero = 0, one = 0, two = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zero++;
            } else if (arr[i] == 1) {
                one++;
            } else {
                two++;
            }
        }
        int i = 0;
        while (zero > 0) {
            arr[i] = 0;
            i++;
            zero--;
        }
        while (one > 0) {
            arr[i] = 1;
            i++;
            one--;
        }
        while (two > 0) {
            arr[i] = 2;
            i++;
            two--;
        }
        printArr(arr);
    }

    public static void printArr(int arr[]) {
        System.out.println("Sorted Array ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array values ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // sortColors(arr);
        // sortUsingCount(arr);
        optimalSort(arr);
    }
}
