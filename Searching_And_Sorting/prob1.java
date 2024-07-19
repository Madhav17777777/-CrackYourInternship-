package Searching_And_Sorting;

import java.util.*;

public class prob1 {
  public static boolean isPossible(Integer a[], int b[],
      int n, int k) {

    Arrays.sort(a, Collections.reverseOrder());

    Arrays.sort(b);

    for (int i = 0; i < n; i++)
      if (a[i] + b[i] < k)
        return false;

    return true;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    int k = sc.nextInt();
    Integer a[] = new Integer[len];
    int b[] = new int[len];
    for (int i = 0; i < len; i++) {
      a[i] = sc.nextInt();
    }
    for (int i = 0; i < len; i++) {
      b[i] = sc.nextInt();
    }
    boolean res = isPossible(a, b, len, k);
    if (res) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
    sc.close();
  }
}
