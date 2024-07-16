package Arrays;

import java.util.*;

public class Prob6 {
  public static long findMinDiff(ArrayList<Integer> a, int n, int m) {
    long ans = 0;
    int arr[] = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = a.get(i);
    }
    Arrays.sort(arr);
    ans = arr[m - 1] - arr[0];
    for (int i = 1; i <= n - m; i++) {
      ans = Math.min(ans, arr[i + m - 1] - arr[i]);
    }
    return ans;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    int n = sc.nextInt();
    int m = sc.nextInt();
    for (int i = 0; i < n; i++) {
      int num = sc.nextInt();
      list.add(num);
    }
    long ans = findMinDiff(list, n, m);
    System.out.println(ans);
    sc.close();
  }
}