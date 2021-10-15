package linked_lists;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SumListsTest {
  
  @Test
  public void testSumInReverseOrder() {
    SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>();
    SinglyLinkedList<Integer> list2 = new SinglyLinkedList<>();

    list1.addBegin(6);
    list1.addBegin(1);
    list1.addBegin(7);

    list2.addBegin(2);
    list2.addBegin(9);
    list2.addBegin(5);

    String actual = new SinglyLinkedList<>(
      SumLists.reverseOrder(list1.getHead(), list2.getHead())
    ).toString();
    String expected = "2 -> 1 -> 9";

    assertEquals(expected, actual);
  }

  @Test
  public void testSumInForwardOrder() {
    SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>();
    SinglyLinkedList<Integer> list2 = new SinglyLinkedList<>();

    list1.addEnd(9);
    list1.addEnd(9);
    list1.addEnd(9);

    list2.addEnd(2);

    String actual = new SinglyLinkedList<>(
      SumLists.forwardOrder(list1.getHead(), list2.getHead())
    ).toString();
    String expected = "1 -> 0 -> 0 -> 1";

    assertEquals(expected, actual);
  }
}
