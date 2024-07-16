package Arrays;

import java.util.*;

public class Prob2 {
  public static void sortColors(int[] nums) {
    int n = nums.length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (nums[j] > nums[j + 1]) {
          int temp = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = temp;
        }
      }
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    int nums[] = new int[len];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = sc.nextInt();
    }
    sortColors(nums);
    sc.close();
  }
}