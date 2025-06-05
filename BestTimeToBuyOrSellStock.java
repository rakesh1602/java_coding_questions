public class BestTimeToBuyOrSellStock {

    //prices = [7,1,5,3,6,4]
    //  1,2,3,4,5,6

    //buy on day 2 and sell on day 5 --> profit increase

    private static int bestDayToBuyOrSellStock(int[] prices) {
        int buy = prices[0]; //let buy at 7
        int profit = 0; // first day profit 0

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buy) { // next day price [1] < yesterday price [7] X
                buy = prices[i];  // price is less next day then buy price is next day price
                //Oh, stock is cheaper today! Let’s assume we buy it today instead.”
            } else if (prices[i] - buy > profit) {  // next day price - buy price greater than profit
                profit = prices[i] - buy; // profit = next day price  - first day price
                //If I sell today, will I earn more than before? If yes, update profit.”
            }
        }
        return profit;
    }
}
