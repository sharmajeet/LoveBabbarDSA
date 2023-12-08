import java.util.Scanner;

public class TwoDArray {
    public static void MatrixSum(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum = sum + arr[i][j];
            }
            System.out.println("Row wise Sum is :" + sum);
        }
    }
public static void ColSum(int arr[][]){
    for(int i=0;i<arr.length;i++){
        int sum=0;{
            for(int j=0;j<arr.length;j++){
                sum = sum+arr[j][i];
            }
            System.out.println("Column wise sum :  " +sum);
        }
    }
}
    public static void printArr(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                // System.out.print(arr[j][i] + " "); //Row Major
                System.out.print(arr[i][j] + " "); // Column Major
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        System.out.print("Enter array values : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        printArr(arr);
        MatrixSum(arr);
        ColSum(arr);
    }
}
