import java.util.Scanner;

public class TwoDArraySearching {
    public static int search(int arr[][], int target, int col, int row) {
        int ans = -1;
        int start = 0;
        int end = row * col - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            // finding rowIndex and ColIndex for searching elements
            int rowIndex = mid / col;
            int colIndex = mid % col;
            if (arr[rowIndex][colIndex] == target) {
                ans = mid;
            }
            if (arr[rowIndex][colIndex] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Rows : ");
        int row = sc.nextInt();
        System.out.print("Enter size of Columns : ");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("Enter array values ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter target element u want to find : ");
        int target = sc.nextInt();
        System.out.print(target + " found at index no : ");
        System.out.println(search(arr, target, col, row));
    }
}
