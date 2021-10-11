package stacks_and_queues;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class ArrayStack<T> implements Stack<T> {
  private final List<T> stack;

  public ArrayStack() {
    stack = new ArrayList<>();
  }

  @Override
  public void push(T item) {
    stack.add(item);
  }

  @Override
  public T pop() {
    if (this.isEmpty()) {
      throw new EmptyStackException();
    }

    int last = stack.size() - 1;
    T item = stack.get(last);
    stack.remove(last);
    return item;
  }

  @Override
  public T peek() {
    if (this.isEmpty()) {
      throw new EmptyStackException();
    }

    return stack.get(stack.size() - 1);
  }

  @Override
  public boolean isEmpty() {
    return stack.isEmpty();
  }
}
