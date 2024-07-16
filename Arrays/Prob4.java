package Arrays;

import java.util.*;

public class Prob4 {
  public static void moveZeroes(int[] nums) {
    int n = nums.length;
    int lastNonZeroFoundAt = 0;
    for (int i = 0; i < n; i++) {
      if (nums[i] != 0) {
        nums[lastNonZeroFoundAt++] = nums[i];
      }
    }
    for (int i = lastNonZeroFoundAt; i < n; i++) {
      nums[i] = 0;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    int arr[] = new int[len];
    for (int i = 0; i < len; i++) {
      arr[i] = sc.nextInt();
    }
    moveZeroes(arr);
    sc.close();
  }
}