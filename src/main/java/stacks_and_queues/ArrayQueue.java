package stacks_and_queues;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ArrayQueue<T> implements Queue<T> {
  private final List<T> queue;
  private int first, last;

  public ArrayQueue() {
    this.queue = new ArrayList<>();
    this.first = this.last = 0;
  }

  @Override
  public void add(T item) {
    queue.add(item);
    last += 1;
  }

  @Override
  public T remove() {
    if (this.isEmpty()) {
      throw new NoSuchElementException();
    }

    return queue.get(first++);
  }

  @Override
  public T peek() {
    if (this.isEmpty()) {
      throw new NoSuchElementException();
    }

    return queue.get(first);
  }

  @Override
  public boolean isEmpty() {
    return first == last;
  }
}
