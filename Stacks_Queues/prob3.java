package Stacks_Queues;

import java.util.*;

public class prob3 {
  public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
    int nextgreater[] = new int[nums2.length];
    for (int i = 0; i < nums2.length; i++) {
      int num = nums2[i];
      int tar = -1;
      for (int j = i + 1; j < nums2.length; j++) {
        if (nums2[j] > num) {
          tar = nums2[j];
          break;
        }
      }
      nextgreater[i] = tar;
    }
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums2.length; i++) {
      map.put(nums2[i], i);
    }
    int ans[] = new int[nums1.length];
    for (int i = 0; i < nums1.length; i++) {
      int num = nums1[i];
      int pos = map.get(num);
      int tar = nextgreater[pos];
      ans[i] = tar;
    }
    return ans;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int len1 = sc.nextInt();
    int len2 = sc.nextInt();
    int nums1[] = new int[len1];
    int nums2[] = new int[len2];
    for (int i = 0; i < len1; i++) {
      nums1[i] = sc.nextInt();
    }
    for (int i = 0; i < len2; i++) {
      nums2[i] = sc.nextInt();
    }
    int ans[] = nextGreaterElement(nums1, nums2);
    for (int i = 0; i < ans.length; i++) {
      System.out.print(ans[i] + " ");
    }
    System.out.println();
    sc.close();
  }
}
