

public class ArrayBasics {
    public static void printDouble(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] * 2 + " ");
        }

    }

    public static boolean linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }

    // counting zero and one's in array
    public static void counting(int arrCount[]) {
        int zero_count = 0, one_count = 0;
        for (int i = 0; i < arrCount.length; i++) {
            if (arrCount[i] == 0) {
                zero_count++;
            }
            if (arrCount[i] == 1) {
                one_count++;
            }
        }
        System.out.println("Count for Zero : " + zero_count);
        System.out.println("Count for One : " + one_count);
    }

    // finding maximum and minimum from array
    public static void maxmin(int arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum number is : " + max);
        System.out.println("Minimum number is : " + min);
    }

    // Two Pointer Approch for ExtreamArray Printing..
    public static void extreamArray(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // if (start > end) {
            // break;
            // }
            if (start == end) {
                System.out.print(arr[start] + " ");
            } else {
                System.out.print(arr[start] + " ");
                System.out.print(arr[end] + " ");
            }
            start++;
            end--;
        }
        return;
    }

    // reverse array using two pointer approch
    public static void reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            // increment , decrement
            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {

        int arr[] = { 1, 3, 5, 7, 9, 8 };
        int arrCount[] = { 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 };
        int key = 70;
        // pr-1
        extreamArray(arr);
        reverse(arr);
        maxmin(arr);
        counting(arrCount);
        printDouble(arr);
        System.out.println();
        if (linearSearch(arr, key)) {
        System.out.println("Found");
        } else {
        System.out.println("Not Found");
        }
    }
}
