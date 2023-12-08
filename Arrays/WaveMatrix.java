import java.util.ArrayList;

public class WaveMatrix {
    public static void waveTraversalForArray(int arr[][], int row, int col) {
        // for row wise we print like this..
        for (int startCol = 0; startCol < row; startCol++) {
            if ((startCol % 2) == 0) {
                // for even print top down
                for (int i = 0; i < col; i++) {
                    System.out.print(arr[startCol][i] + " ");
                }
            } else {
                for (int j = col - 1; j >= 0; j--) {
                    System.out.print(arr[startCol][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void waveTraversal(ArrayList<ArrayList<Integer>> list) {
        int row = 3;
        int col = 3;

        for (int startCol = 0; startCol < 3; startCol++) {
            // finding even no of column
            if ((startCol % 2) == 0) { // ((startCol & 1)== 0)
                // for even we print top to bottom
                for (int i = 0; i < col; i++) {
                    System.out.print(list.get(i).get(startCol) + " ");
                }
                System.out.println();

            } else {
                // for bottom to top
                for (int j = row - 1; j >= 0; j--) {
                    System.out.print(list.get(j).get(startCol) + " ");

                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        // for Array
        int row = 3;
        int col = 3;
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        waveTraversalForArray(arr, row, col);

        // ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // for (int i = 0; i < 3; i++) {
        // ArrayList<Integer> InnerList = new ArrayList<>();
        // for (int j = 0; j < 3; j++) {
        // InnerList.add(j + 1);

        // }
        // list.add(InnerList);

        // }
        // waveTraversal(list);

    }
}
