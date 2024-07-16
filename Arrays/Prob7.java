package Arrays;

import java.util.*;

public class Prob7 {

  public static int[] twoSum(int[] nums, int target) {
    int ans[] = new int[2];
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (i != j) {
          if (nums[i] + nums[j] == target) {
            ans[0] = i;
            ans[1] = j;
            return ans;
          }
        }
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    int nums[] = new int[len];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = sc.nextInt();
    }
    int target = sc.nextInt();
    int ans[] = twoSum(nums, target);
    System.out.println(ans[0] + " " + ans[1]);
    sc.close();
  }
}
