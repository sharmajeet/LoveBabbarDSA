public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] price = new int[] { 7,5,6,4,71 };
        System.out.println("Max Profit : " + maxprofit(price));
     
     
    }


    public static int maxprofit(int[] price) {
        int buyPrice = price[0];
        int maxProfit = 0;

        for (int i = 1; i < price.length; i++) {
            int sellPrice = price[i];
            int currentProfit = sellPrice - buyPrice;

            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }
            if (currentProfit < maxProfit) {
                return maxProfit;
            }

        }
        return maxProfit;

    }
}
