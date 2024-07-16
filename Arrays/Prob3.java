package Arrays;

import java.util.*;

public class Prob3 {

  public static int removeDuplicates(int[] arr) {
    if (arr.length == 0) {
      return 0;
    }

    int uniqueIndex = 0;

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] != arr[uniqueIndex]) {

        uniqueIndex++;
        arr[uniqueIndex] = arr[i];
      }
    }

    return uniqueIndex + 1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    int arr[] = new int[len];
    for (int i = 0; i < len; i++) {
      arr[i] = sc.nextInt();
    }
    int ans = removeDuplicates(arr);
    System.out.println(ans);
    sc.close();
  }
}