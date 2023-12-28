package Recursion;

public class n_thStair {
    public static void main(String[] args) {
        int n = 5;
        int ans = findWays(n);
        System.out.println( " Total Possible Ways to reach " + n + " th stair is : " + ans);
    }

    public static int findWays(int n) {
        if(n == 0 || n == 1 || n == 2){
            return n;
        }

        int ans = findWays(n-2) + findWays(n-1);
        return ans;
    }

}
