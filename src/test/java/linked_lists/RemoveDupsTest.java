package linked_lists;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RemoveDupsTest {
  
  @Test
  public void testWhenListHasDups() {
    SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
    list.addEnd(5);
    list.addEnd(8);
    list.addEnd(1);
    list.addEnd(5);
    list.addEnd(2);
    list.addEnd(4);
    list.addEnd(1);
    list.addEnd(4);
    
    RemoveDups.run(list.getHead());

    assertEquals(list.toString(), "5 -> 8 -> 1 -> 2 -> 4");
  }

  @Test
  public void testWhenListHasNoDups() {
    SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
    list.addEnd(5);
    list.addEnd(8);
    list.addEnd(1);
    list.addEnd(2);
    list.addEnd(4);
    
    RemoveDups.run(list.getHead());

    assertEquals(list.toString(), "5 -> 8 -> 1 -> 2 -> 4");
  }
}
