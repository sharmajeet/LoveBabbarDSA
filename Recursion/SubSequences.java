package Recursion;

public class SubSequences {
    public static void main(String[] args) {
        String input = "abc";
        StringBuilder output = new StringBuilder();
        int i = 0;
        String target = "abc";

        printSubSequences(input, output, i);
        System.out.println(target + " is Subsequence of String : " + isSubSequence(input, target));

    }

    public static boolean isSubSequence(String input, String target) {
        char curr_input[] = input.toCharArray();
        char curr_target[] = target.toCharArray();
        int i = 0;
        int j = 0;
        while (i < curr_input.length && j < curr_target.length) {
            if (curr_input[i] == curr_target[j]) {
                i++;
                j++;
            } else {
                j++;
            }

        }
        if (i == curr_target.length) {
            return true;
        }
        return false;
    }

    public static void printSubSequences(String input, StringBuilder output, int i) {

        // base case
        if (i >= input.length()) {
            System.out.println(output);
            return;
        }

        // exclude case
        printSubSequences(input, new StringBuilder(output), i + 1);

        // include case ... string is included
        output.append(input.charAt(i));

        printSubSequences(input, new StringBuilder(output), i + 1);

    }
}

// note for StringBuilder
// In Java, StringBuilder is a mutable class, which means that the modifications
// made to an instance of StringBuilder affect the original instance. In the
// recursive function you provided, you are appending characters to the output
// StringBuilder in both the exclude case and the include case. If you don't
// create a new StringBuilder for each recursive call, the modifications made in
// one call will affect subsequent calls, leading to incorrect results.