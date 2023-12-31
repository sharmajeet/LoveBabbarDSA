import java.util.ArrayList;

public class ZigZag {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;

        System.out.println(zigzagString(s, numRows));
    }

    public static String zigzagString(String s, int numRows) {

        // base case
        if (numRows == 1) {
            return s;
        }

        ArrayList<StringBuilder> zigzag = new ArrayList<>(numRows);

        for (int i = 0; i < numRows; i++) {
            zigzag.add(new StringBuilder());
        }

        int i = 0;
        int row = 0;
        boolean direction = true;

        while (i < s.length()) {
            if (direction) {
                while (row < numRows && i < s.length()) {
                    zigzag.get(row).append(s.charAt(i++));
                    row++;
                }
                row = numRows - 2;
            } else {
                while (row >= 0 && i < s.length()) {
                    zigzag.get(row).append(s.charAt(i++));
                    row--;
                }
                row = 1;
            }

            direction = !direction;
        }

        StringBuilder ans = new StringBuilder();
        for (StringBuilder sb : zigzag) {
            ans.append(sb);
        }
        return ans.toString();
    }
}

