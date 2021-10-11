package stacks_and_queues;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

public class SetOfStacks {
  private final List<Stack<Integer>> stacks;

  public SetOfStacks() {
    stacks = new ArrayList<>();
  }

  public void push(int item) {
    int last = stacks.size() - 1;
    if (stacks.isEmpty() || stacks.get(last).size() == 3) {
      Stack<Integer> newStack = new Stack<>();
      newStack.add(item);
      stacks.add(newStack);
    } else {
      stacks.get(last).add(item);
    }
  }

  public int pop() {
    if (stacks.isEmpty()) {
      throw new EmptyStackException();
    }

    int last = stacks.size() - 1;
    int top = stacks.get(last).pop();

    if (stacks.get(last).isEmpty()) {
      stacks.remove(last);
    }

    return top;
  }

  public int peek() {
    if (stacks.isEmpty()) {
      throw new EmptyStackException();
    }

    int last = stacks.size() - 1;
    return stacks.get(last).peek();
  }

  public int popAt(int index) {
    if (index == stacks.size() - 1) {
      return stacks.get(index).pop();
    }

    int elem = stacks.get(index).pop();
    int top = popNext(index + 1);
    stacks.get(index).push(top);
    return elem;
  }

  public void printStack() {
    for (Stack<Integer> stack : stacks) {
      for (Integer elem : stack) {
        System.out.print(elem + " - ");
      }
      System.out.print("\n");
    }
  }

  private int popNext(int index) {
    if (index != stacks.size() - 1) {
      int elem = popNext(index + 1);
      stacks.get(index).push(elem);
    }

    int item = stacks.get(index).get(0);
    stacks.get(index).remove(0);
    return item;
  }
}
