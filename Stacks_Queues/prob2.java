package Stacks_Queues;

import java.util.*;

public class prob2 {
  class MyStack {
    private Queue<Integer> queue1; // For pushing elements
    private Queue<Integer> queue2; // For popping elements

    public MyStack() {
      queue1 = new LinkedList<>();
      queue2 = new LinkedList<>();
    }

    public void push(int x) {
      // Add the new element to the queue1
      queue1.offer(x);

      // Move all elements from queue2 to queue1
      while (!queue2.isEmpty()) {
        queue1.offer(queue2.poll());
      }

      // Swap the names of queue1 and queue2
      Queue<Integer> temp = queue1;
      queue1 = queue2;
      queue2 = temp;
    }

    public int pop() {
      // As the elements are pushed to queue2, popping from queue2 gives LIFO behavior
      return queue2.poll();
    }

    public int top() {
      // Peek the front element of queue2 to get the top element of the stack
      return queue2.peek();
    }

    public boolean empty() {
      return queue2.isEmpty();
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    sc.close();
  }
}
