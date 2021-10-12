package linked_lists;

public class ReturnKthToLast {
  private static int getListSize(ListNode<Integer> head) {
    if (head == null) return 0;

    return getListSize(head.next) + 1;
  }

  private static int getAnswer(ListNode<Integer> head, int n) {
    if (n == 0) return head.data;
    
    return getAnswer(head.next, n - 1);
  }

  public static int run(ListNode<Integer> head, int k) {
    return getAnswer(head, getListSize(head) - k);
  }
}
