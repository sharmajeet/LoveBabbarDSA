import java.util.Arrays;
import java.util.Scanner;

public class SearchInArray {
    public static void transpose(int arr[][]) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void MAXMIN(int arr[][]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Maximum : " + max + " And Minimum : " + min);
    }

    public static boolean Search(int arr[][], int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == key) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];

        System.out.println("Enter the values : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Key is :");
        int key = sc.nextInt();
        System.out.println(Search(arr, key));
        MAXMIN(arr);
        transpose(arr);
    }
}