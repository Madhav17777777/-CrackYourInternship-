package Arrays;

import java.util.*;

public class Prob1 {

  public static int findDuplicate(int[] nums) {
    int maps[] = new int[nums.length + 1];
    for (int i = 0; i < nums.length; i++) {
      maps[nums[i]]++;
    }
    int ans = 0;
    for (int i = 0; i < maps.length; i++) {
      if (maps[i] > 1) {
        ans = (i);
        break;
      }

    }
    return ans;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    int nums[] = new int[len];
    for (int i = 0; i < len; i++) {
      nums[i] = sc.nextInt();
    }
    int res = findDuplicate(nums);
    System.out.println(res);
    sc.close();
  }
}