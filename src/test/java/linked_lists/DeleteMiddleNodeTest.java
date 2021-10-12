package linked_lists;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DeleteMiddleNodeTest {

  @Test
  public void testDeletingMiddleNode() {
    SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
    list.addEnd(1);
    list.addEnd(2);
    list.addEnd(3);
    list.addEnd(4);
    list.addEnd(5);
    list.addEnd(6);

    DeleteMiddleNode.run(list.getHead());

    assertEquals(list.toString(), "1 -> 2 -> 3 -> 5 -> 6");
  }
}
