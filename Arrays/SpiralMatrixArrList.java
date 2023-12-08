import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixArrList {
    public static List<Integer> optimizespiral(int matrix[][]) {
        List<Integer> ans = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;

        int startRow = 0;
        int endRow = row - 1;
        int startCol = 0;
        int endCol = col - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Traverse right
            for (int i = startCol; i <= endCol; i++) {
                ans.add(matrix[startRow][i]);
            }
            startRow++;

            // Traverse down
            for (int i = startRow; i <= endRow; i++) {
                ans.add(matrix[i][endCol]);
            }
            endCol--;

            // Traverse left (if there is a valid row left to traverse)
            if (startRow <= endRow) {
                for (int i = endCol; i >= startCol; i--) {
                    ans.add(matrix[endRow][i]);
                }
                endRow--;
            }

            // Traverse up (if there is a valid column left to traverse)
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    ans.add(matrix[i][startCol]);
                }
                startCol++;
            }
        }
        return ans;

    }

    // vrute force approch
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int count = 0;
        int total_element = row * col;

        int startingCol = 0;
        int endingCol = col - 1;
        int startingRow = 0;
        int endingRow = row - 1;

        while (ans.size() < total_element) {
            // 1st case
            for (int i = startingCol; i <= endingCol && ans.size() < total_element; i++) {
                ans.add(matrix[startingRow][i]);
                count++;
            }
            startingRow++;
            // 2nd case
            for (int i = startingRow; i <= endingRow && ans.size() < total_element; i++) {
                ans.add(matrix[i][endingCol]);
            }
            endingCol--;
            // 3rd case
            for (int i = endingCol; i >= startingCol && ans.size() < total_element; i--) {
                ans.add(matrix[endingRow][i]);
            }
            endingRow--;
            // 4th case
            for (int i = endingRow; i >= startingRow && ans.size() < total_element; i--) {
                ans.add(matrix[i][startingCol]);
            }
            startingCol++;
        }
        return ans;

    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println(optimizespiral(arr));
    }
}
