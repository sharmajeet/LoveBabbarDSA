import java.util.Scanner;

public class TransposeOfMatrix {

    public static int[][] transpose(int[][] matrix, int row, int col) {
        int[][] arr = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = matrix[j][i];
            }
        }
    return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter values for row : ");
        int row = sc.nextInt();
        System.out.print("Enter values for col : ");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();

            }
            System.out.println();
        }

        int[][] transposedMatrix = transpose(matrix, row, col);

        System.out.println("Transpose of matrix:");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    

    }
}
