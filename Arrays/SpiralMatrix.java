public class SpiralMatrix {
    public static void spiral(int matrix[][]) {

        // size of row and column
        int col = matrix.length;
        int row = matrix[0].length;
        System.out.println("Size of Row : " + row + " , Size of Column : " + col + " .");
        int total_elements = row * col;
        
        int startCol = 0;
        int endingCol = col - 1;
        int startRow = 0;
        int endingRow = row - 1;

        int count = 0;
        // 1st - looping and conditions
        while (count < total_elements) {
            // printing startingRow
            for (int i = startCol; i <= endingCol && count < total_elements; i++) {
                System.out.print(matrix[startCol][i] + " ");
                count++;
            }
        startRow++;
        // 2nd -
        // printing ending column
        for (int i = startRow; i <= endingRow && count < total_elements; i++) {
            System.out.print(matrix[i][endingCol]+ " ");
            count++;
        }
        endingCol--;
        // 3rd -
        // printing ending row
        for (int i = endingCol; i >= startCol && count < total_elements; i--) {
            System.out.print(matrix[endingRow][i]+ " ");
            count++;
        }
        endingRow--;
        // 4th -
        // printing starting column
        for (int i = endingRow; i >= startRow && count < total_elements; i--) {
            System.out.print(matrix[i][startCol]+" ");
            count++;
        }
        startCol++;
    }
        // printArr(matrix);

    }

    public static void printArr(int matrix[][]) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        // int matrix[][] = { { 11, 12, 13, 14 },
        //         { 15, 16, 17, 18 },
        //         { 19, 20, 21, 22 },
        //         { 23, 24, 25, 26 } };

        spiral(matrix);
    }
}
