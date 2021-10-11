package stacks_and_queues;

import java.util.NoSuchElementException;

public class LinkedQueue<T> implements Queue<T> {
  private static class Node<T> {
    private final T data;
    private Node<T> next;

    private Node(T data) {
      this.data = data;
    }
  }

  private Node<T> first;
  private Node<T> last;

  public LinkedQueue() {
    this.first = this.last = null;
  }

  @Override
  public void add(T item) {
    Node<T> node = new Node<>(item);
    if (last != null) last.next = node;
    last = node;
    if (first == null) first = last;
  }

  @Override
  public T remove() {
    if (this.isEmpty()) throw new NoSuchElementException();
    T data = first.data;
    first = first.next;
    if (first == null) last = null;
    return data;
  }

  @Override
  public T peek() {
    if (this.isEmpty()) throw new NoSuchElementException();
    return first.data;
  }

  @Override
  public boolean isEmpty() {
    return first == null;
  }
}
