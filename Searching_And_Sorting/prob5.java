package Searching_And_Sorting;

import java.util.*;

public class prob5 {
  public static int search(int[] nums, int target) {
    int l = 0, r = nums.length - 1, mid;
    while (l <= r) {
      mid = (l + r) / 2;
      if (nums[mid] == target) {
        return mid;
      } else if (nums[l] <= nums[mid]) {
        if (target >= nums[l] && target <= nums[mid]) {
          r = mid - 1;
        } else {
          l = mid + 1;
        }
      } else {
        if (target <= nums[r] && target >= nums[mid]) {
          l = mid + 1;
        } else {
          r = mid - 1;
        }
      }
    }
    return -1;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int target = sc.nextInt();
    int ans = search(arr, target);
    System.out.println(ans);
    sc.close();
  }
}
