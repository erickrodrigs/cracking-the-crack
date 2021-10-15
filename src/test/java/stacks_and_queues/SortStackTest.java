package stacks_and_queues;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Stack;

import org.junit.jupiter.api.Test;

public class SortStackTest {

  @Test
  public void testSortStack() {
    Stack<Integer> stack = new Stack<>();

    stack.push(5);
    stack.push(6);
    stack.push(3);
    stack.push(9);
    stack.push(8);

    SortStack.run(stack);

    String sortedStackString = "[9, 8, 6, 5, 3]";

    assertEquals(sortedStackString, stack.toString());
  }
}
