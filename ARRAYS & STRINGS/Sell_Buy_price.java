/*
Buy and Sell Stocks [7, 1, 5, 3, 6, 4]
*/

public class Sell_Buy_price{
  
  public static int stockbuypriceandsellprice(int price[]) {
    
    int buyPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for(int i=0; i<price.length; i++){

      if (buyPrice < price[i]) {
        int profit = price[i] - buyPrice;

        maxProfit = Math.max(maxProfit, profit);
      } else {
        buyPrice = price[i];
      }

    }

    return maxProfit;

  }

  public static void main(String[] args) {

    int price[] = {7, 1, 5, 3, 6, 4};
    System.out.println(stockbuypriceandsellprice(price));
    
  }
}

/*
output: 5

Time Complexity: O(n)
Space Complexity: O(1)
*/