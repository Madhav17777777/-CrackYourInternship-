package Greedy;

import java.util.*;

public class prob1 {
  public static int canCompleteCircuit(int[] gas, int[] cost) {
    int spent = 0;
    for (int i = 0; i < cost.length; i++) {
      spent += (cost[i]);
    }
    int gassum = 0;
    for (int i = 0; i < gas.length; i++) {
      gassum += (gas[i]);
    }
    if (spent > gassum) {
      return -1;
    }
    int currentgas = 0;
    int startingindex = 0;
    for (int i = 0; i < gas.length; i++) {
      currentgas += (gas[i] - cost[i]);
      if (currentgas < 0) {
        currentgas = 0;
        startingindex = i + 1;
      }
    }
    return startingindex;

  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    int gas[] = new int[len];
    int cost[] = new int[len];
    for (int i = 0; i < len; i++) {
      gas[i] = sc.nextInt();
    }
    for (int i = 0; i < len; i++) {
      cost[i] = sc.nextInt();
    }
    int ans = canCompleteCircuit(gas, cost);
    System.out.println(ans);
    sc.close();
  }
}
