package Searching_And_Sorting;

import java.util.*;

public class prob3 {
  public static boolean isPossible(long a[], long b[], int n, long k) {

    Long[] aLong = Arrays.stream(a).boxed().toArray(Long[]::new);
    Long[] bLong = Arrays.stream(b).boxed().toArray(Long[]::new);

    Arrays.sort(aLong);

    Arrays.sort(bLong, Collections.reverseOrder());

    for (int i = 0; i < n; i++) {
      if (aLong[i] + bLong[i] < k) {
        return false;
      }
    }

    return true;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long k = sc.nextLong();

    long a[] = new long[n];
    long b[] = new long[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
    }
    for (int i = 0; i < n; i++) {
      b[i] = sc.nextLong();
    }
    boolean res = isPossible(a, b, n, k);
    if (res) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
    sc.close();
  }
}
