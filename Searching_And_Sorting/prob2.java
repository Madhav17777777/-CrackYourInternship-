package Searching_And_Sorting;

import java.util.*;

public class prob2 {
  public static int findPair(int n, int x, int[] arr) {
    Arrays.sort(arr);
    for (int i = 0; i < n; i++) {
      int target = arr[i] + x;
      int l = i + 1;
      int h = n - 1;
      while (l <= h) {
        int mid = l + (h - l) / 2;
        if (arr[mid] == target) {
          return 1;
        } else if (arr[mid] < target) {
          l = mid + 1;
        } else {
          h = mid - 1;
        }
      }
    }
    return -1;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int ans = findPair(n, x, arr);
    System.out.println(ans);
    sc.close();
  }
}
