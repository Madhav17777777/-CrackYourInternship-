package Arrays;

import java.util.*;

public class Prob8 {

  public static int maxProfit(int[] prices) {
    int max = 0;
    int start = prices[0];
    int len = prices.length;
    for (int i = 1; i < len; i++) {
      if (start < prices[i])
        max += prices[i] - start;
      start = prices[i];
    }
    return max;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    int prices[] = new int[len];
    for (int i = 0; i < prices.length; i++) {
      prices[i] = sc.nextInt();
    }
    int maxpr = maxProfit(prices);
    System.out.println(maxpr);
    sc.close();
  }
}