package linked_lists;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReturnKthToLastTest {
  
  @Test
  public void testReturningTheKthLastElement() {
    SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
    list.addEnd(50);
    list.addEnd(40);
    list.addEnd(30);
    list.addEnd(20);
    list.addEnd(10);

    assertEquals(ReturnKthToLast.run(list.getHead(), 3), 30);
  }
}
