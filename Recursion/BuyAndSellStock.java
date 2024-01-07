package Recursion;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int price[] = new int[] { 7,5,4,3,2,1 };

        int minPrice = Integer.MAX_VALUE;
        int maxProfit[] = new int[] { Integer.MIN_VALUE };

        recursive(price, minPrice, maxProfit, 0);
        System.out.println(maxProfit[0]);
    }

    public static int recursive(int[] price, int minPrice, int[] maxProfit, int i) {
        // base case
        if (i == price.length) {
            return 0;
        }

        if (price[i] < minPrice) {
            minPrice = price[i];
        }
        int currentProfit = price[i] - minPrice;
        if (currentProfit> maxProfit[0]) {
            maxProfit[0] = currentProfit;
        }

       return recursive(price, minPrice, maxProfit, i + 1);

    }
}
