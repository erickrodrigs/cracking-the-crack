package linked_lists;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PalindromeTest {

  @Test
  public void testWhenListIsNotPalindrome() {
    SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

    list.addEnd(6);
    list.addEnd(1);
    list.addEnd(7);
    list.addEnd(1);
    list.addEnd(6);

    assertTrue(Palindrome.run(list.getHead()));
  }

  @Test
  public void testWhenListIsPalindrome() {
    SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

    list.addEnd(4);
    list.addEnd(1);
    list.addEnd(4);
    list.addEnd(2);
    list.addEnd(4);

    assertFalse(Palindrome.run(list.getHead()));
  }
}
