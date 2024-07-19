package Searching_And_Sorting;

import java.util.*;

public class prob4 {
  public static boolean reversing(int arr[], int n) {
    int start = 0;
    int end = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        start = i;
        break;
      }
    }
    if (start == -1) {
      return true;
    }
    for (int i = arr.length - 1; i > 0; i--) {
      if (arr[i - 1] > arr[i]) {
        end = i;
        break;
      }
    }
    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        return false;
      }
    }

    return true;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    boolean res = reversing(arr, n);
    if (res) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
    sc.close();
  }
}
