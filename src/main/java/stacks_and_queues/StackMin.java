package stacks_and_queues;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackMin {
  private Stack<Integer> stack;
  private Stack<Integer> minimumStack;

  public StackMin() {
    stack = new Stack<>();
    minimumStack = new Stack<>();
  }

  public void push(int item) {
    if (minimumStack.isEmpty() || item <= minimumStack.peek()) {
      minimumStack.add(item);
    }

    stack.add(item);
  }

  public int pop() {
    if (stack.isEmpty()) {
      throw new EmptyStackException();
    }

    int top = stack.pop();

    if (top == minimumStack.peek()) {
      minimumStack.pop();
    }

    return top;
  }

  public int min() {
    if (minimumStack.isEmpty()) {
      throw new EmptyStackException();
    }

    return minimumStack.peek();
  }
}
