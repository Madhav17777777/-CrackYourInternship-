package Dynamic_Programming;

import java.util.*;

public class Prob2 {
  public static int maxProduct(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }

    int maxProduct = nums[0];
    int minProduct = nums[0];
    int result = nums[0];

    for (int i = 1; i < nums.length; i++) {
      // If the current number is negative, swap the max and min product
      if (nums[i] < 0) {
        int temp = maxProduct;
        maxProduct = minProduct;
        minProduct = temp;
      }

      maxProduct = Math.max(nums[i], maxProduct * nums[i]);
      minProduct = Math.min(nums[i], minProduct * nums[i]);

      result = Math.max(result, maxProduct);
    }

    return result;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    int arr[] = new int[len];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    int ans = maxProduct(arr);
    System.out.println(ans);
    sc.close();
  }
}
