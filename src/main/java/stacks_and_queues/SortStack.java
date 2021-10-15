package stacks_and_queues;

import java.util.Stack;

public class SortStack {
  public static void run(Stack<Integer> stack) {
    if (stack.empty()) return;
    
    Stack<Integer> tmp = new Stack<>();
    tmp.push(stack.pop());

    while (!stack.empty()) {
      if (stack.peek() >= tmp.peek()) {
        tmp.push(stack.pop());
      } else {
        int currentMin = stack.pop();

        while (!tmp.empty() && currentMin < tmp.peek()) {
          stack.push(tmp.pop());
        }

        tmp.push(currentMin);
      }
    }

    while (!tmp.empty()) {
      stack.push(tmp.pop());
    }
  }
}
