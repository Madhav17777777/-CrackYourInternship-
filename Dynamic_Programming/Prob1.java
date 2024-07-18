package Dynamic_Programming;

import java.util.*;

public class Prob1 {
  public static int climbStairs(int n) {
    int dp[] = new int[n + 1];
    // dp[i]-->denotes the state --> no.of ways to reach ith level
    dp[0] = 1; // as we are stating from here
    dp[1] = 1;// as we can take only 1 way of climbinig 1 step to reach level 1

    for (int i = 2; i <= n; i++) {
      dp[i] = dp[i - 1] + dp[i - 2]; // to reach level i , we can come either from level i-1 by taking 1 step or from
                                     // level i-2 by taking 2 step , so adding all the ways
    }

    return dp[n]; // at last we return the number of ways to reach the destination
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int res = climbStairs(n);
    System.out.println(res);
    sc.close();
  }
}
