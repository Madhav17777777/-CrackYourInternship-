package Dynamic_Programming;

import java.util.*;

public class Prob3 {
  public static int[] countBits(int n) {
    int ans[] = new int[n + 1];
    for (int i = 0; i <= n; i++) {
      String binaryString = Integer.toBinaryString(i);
      int ones = 0;
      for (int j = 0; j < binaryString.length(); j++) {
        if (binaryString.charAt(j) == '1') {
          ones++;
        }
      }
      ans[i] = ones;
    }
    return ans;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans[] = countBits(n);
    for (int i = 0; i <= n; i++) {
      System.out.print(ans[i] + " ");
    }
    System.out.println();
    sc.close();
  }
}
