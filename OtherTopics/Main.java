package OtherTopics;

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main"
class Main {
    public static void main(String[] args) {
        String str = "abcdefdcd";
        char target = 'd';
        int ans[] = new int[] { -1 };
        int i = 0;
        int j = str.length() - 1;
        find(str, target, ans, i);
        lastToFirst(str, target, ans, j);
        System.out.println(ans[0]);
    }

    public static int find(String str, char target, int[] ans, int i) {
        // base case
        if (i == str.length()) {
            return -1;
        }

        if (str.charAt(i) == target) {
            ans[0] = i;
        }

        return find(str, target, ans, i + 1);

    }

    public static int lastToFirst(String str, char target, int[] ans, int j) {
        // base case
        if (j <= 0) {
            return -1;
        }

        if (str.charAt(j) == target) {
            ans[0] = j;
            return ans[0];
        }

        return lastToFirst(str, target, ans, j - 1);

    }
}
