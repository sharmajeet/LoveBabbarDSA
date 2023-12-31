import java.util.Scanner;

public class ArrayPairSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter value for target : ");
        int target = sc.nextInt();

        findPair(arr, target);

    }

    public static void findPair(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.print("(" + arr[i] + "," + arr[j] + ") ");
                }
                break;
            }
            // break;
        }
    }
    // public static int
}
