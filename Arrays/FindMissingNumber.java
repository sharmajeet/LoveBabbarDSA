import java.util.Scanner;

public class FindMissingNumber {
    public static int findMissing(int arr[]) {

        int i = 0;
        // exception case where we input wrong values
        if (arr[i] == 0 || arr[i] > arr.length) {
            return -1;
        }
        while (i < arr.length) {
            int comp = arr[i] - 1;
            if (comp >= 0 && arr[i] != arr[comp]) {
                // swap
                int temp = arr[i];
                arr[i] = arr[comp];
                arr[comp] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return j + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        System.out.println("Enter array values");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // int arr[] = { 1, 5, 3, 4, 3 };
        System.out.print("Missing Element : ");
        System.out.println(findMissing(arr));

    }
}
