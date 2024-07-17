package Arrays;

import java.util.*;

public class Prob10 {
  public static List<Integer> findDuplicates(int[] nums) {
    List<Integer> list = new ArrayList<>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == nums[i + 1]) {
        list.add(nums[i]);
      }
    }
    return list;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    int nums[] = new int[len];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = sc.nextInt();
    }
    List<Integer> ans = findDuplicates(nums);
    for (int i = 0; i < ans.size(); i++) {
      System.out.print(ans.get(i) + " ");
    }
    System.out.println();
    sc.close();

  }
}
