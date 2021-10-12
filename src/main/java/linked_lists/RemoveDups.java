package linked_lists;

public class RemoveDups {
  private static void removeElement(ListNode<Integer> head, ListNode<Integer> prev, int target) {
    if (head == null) return;

    if (head.data == target) {
      prev.next = head.next;
      removeElement(head.next, prev, target);
    } else {
      removeElement(head.next, prev.next, target);
    }
  }

  public static void run(ListNode<Integer> head) {
    if (head == null) return;

    removeElement(head.next, head, head.data);
    run(head.next);
  }
}
