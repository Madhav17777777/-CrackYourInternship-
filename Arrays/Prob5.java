package Arrays;

import java.util.*;

public class Prob5 {

  public static int maxProfit(int[] prices) {
    if (prices == null || prices.length <= 1) {
      return 0;
    }

    int n = prices.length;
    int[] dp = new int[n]; // dp[i] represents the maximum profit that can be obtained up to day i

    dp[0] = 0;
    int minPrice = prices[0];

    for (int i = 1; i < n; i++) {

      int currentProfit = prices[i] - minPrice;

      dp[i] = Math.max(dp[i - 1], currentProfit);

      minPrice = Math.min(minPrice, prices[i]);
    }

    return dp[n - 1];
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    int prices[] = new int[len];
    for (int i = 0; i < len; i++) {
      prices[i] = sc.nextInt();
    }
    int ans = maxProfit(prices);
    System.out.println(ans);
    sc.close();
  }
}