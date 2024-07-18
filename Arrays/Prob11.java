package Arrays;

import java.util.*;

public class Prob11 {
  public static int maxArea(int[] height) {
    int j = height.length - 1;
    int i = 0;
    int area = 0;
    int max = 0;
    while (i < j) {
      int h = Math.min(height[i], height[j]);
      area = h * (j - i);
      max = Math.max(area, max);
      if (height[i] > height[j]) {
        j--;
      } else {
        i++;
      }
    }
    return max;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    int arr[] = new int[len];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    int ans = maxArea(arr);
    System.out.println(ans);
    sc.close();
  }
}
