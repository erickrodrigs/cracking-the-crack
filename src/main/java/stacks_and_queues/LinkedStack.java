package stacks_and_queues;

import java.util.EmptyStackException;

public class LinkedStack<T> implements Stack<T> {
  private static class Node<T> {
    private final T data;
    private Node<T> next;

    private Node(T data) {
      this.data = data;
    }
  }

  private Node<T> stack;

  public LinkedStack() {
    this.stack = null;
  }

  @Override
  public void push(T item) {
    Node<T> node = new Node<>(item);
    node.next = stack;
    stack = node;
  }

  @Override
  public T pop() {
    if (this.isEmpty()) {
      throw new EmptyStackException();
    }

    T item = stack.data;
    stack = stack.next;
    return item;
  }

  @Override
  public T peek() {
    if (this.isEmpty()) {
      throw new EmptyStackException();
    }

    return stack.data;
  }

  @Override
  public boolean isEmpty() {
    return stack == null;
  }
}
