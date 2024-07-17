package Arrays;

import java.util.*;

public class Prob9 {
  public static int subarraysDivByK(int[] nums, int k) {

    int n = nums.length, prefSum = 0, ans = 0;
    Map<Integer, Integer> prevOcc = new HashMap<>();
    prevOcc.put(0, 1);

    for (int i = 0; i < n; i++) {
      prefSum = (prefSum + nums[i] % k + k) % k;
      ans += prevOcc.getOrDefault(prefSum, 0);
      prevOcc.put(prefSum, prevOcc.getOrDefault(prefSum, 0) + 1);
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
    int k = sc.nextInt();
    int ans = subarraysDivByK(nums, k);
    System.out.println(ans);
    sc.close();
  }
}
