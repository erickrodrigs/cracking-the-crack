package stacks_and_queues;

public interface Stack<T> {

  void push(T item); // O(1)

  T pop(); // O(1)

  T peek(); // O(1)

  boolean isEmpty(); // O(1)
}
