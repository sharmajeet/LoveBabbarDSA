package Recursion;

public class SearchChar {
    public static void main(String[] args) {
        String str = "Jeet sharma";
        char target = 'r';
        int[] index = {0}; // Using an array to simulate passing by reference
        boolean result = search(str, index, target);
        if (result) {
            System.out.println(target + " present at index: " + index[0]);
        } else {
            System.out.println(target + " not found in the string.");
        }
    }

    public static boolean search(String str, int[] index, char target) {
        // base case
        if (index[0] >= str.length()) {
            return false;
        }

        if (str.charAt(index[0]) == target) {
            return true;
        } else {
            // increment index and make the recursive call
            index[0]++;
            return search(str, index, target);
        }
    }
}
