package linked_lists;

public class DeleteMiddleNode {
  private static void deleteMiddle(ListNode<Integer> fast, ListNode<Integer> slow, ListNode<Integer> prevSlow) {
    if (fast == null || fast.next == null) {
      if (prevSlow == null) {
        slow = null;
      } else {
        prevSlow.next = slow.next;
      }

      return;
    }

    deleteMiddle(fast.next.next, slow.next, slow);
  }

  public static void run(ListNode<Integer> head) {
    deleteMiddle(head, head, null);
  }
}
