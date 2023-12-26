public class StockBuyAndSell {
    public static void main(String[] args) {

        int arr[] = new int[] { 22, 3, 44, 5, 61, 1 };

        int MaxProfit = findProfit(arr);

        System.out.println("Max : " + MaxProfit);
    }

    public static int findProfit(int arr[]) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            minPrice = Math.min(minPrice, arr[i]);
            maxProfit = Math.max(maxProfit, arr[i] - minPrice);
        }

        return maxProfit;
    }
}
