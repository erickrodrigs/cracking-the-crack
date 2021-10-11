package stacks_and_queues;

public interface Queue<T> {

  void add(T item); // O(1)

  T remove(); // O(1)

  T peek(); // O(1)

  boolean isEmpty(); // O(1)
}
