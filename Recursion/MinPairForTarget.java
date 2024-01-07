package Recursion;

import java.util.ArrayList;

public class MinPairForTarget {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        int target = 1;
        int start = 0;

        int ans = solve(list, target,start);
        System.out.println(ans);

    }

    public static int solve(ArrayList list, int target,int start) {
        // base case
        if (target == 0) {
            return 0;
        }

        if (target < 0) {
            return Integer.MAX_VALUE;
        }

        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            int ans = solve(list, target - (int)list.get(i),i-start);
            if (ans != Integer.MAX_VALUE) {
                mini = Math.min(mini, ans + 1); 
            }
        }
        return mini;
    }
}
