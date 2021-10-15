package linked_lists;

public class Palindrome {
  private static int getListSize(ListNode<Integer> head) {
    if (head == null) return 0;

    return getListSize(head.next) + 1;
  }

  private static ListNode<Integer> returnKthHelper(ListNode<Integer> head, int n) {
    if (n == 0) return head;
    
    return returnKthHelper(head.next, n - 1);
  }

  private static ListNode<Integer> returnKthToLast(ListNode<Integer> head, int k) {
    return returnKthHelper(head, getListSize(head) - k);
  }

  private static boolean palindromeHelper(ListNode<Integer> nodeA, int k) {
    ListNode<Integer> node = returnKthToLast(nodeA, k);

    if (nodeA == node || (nodeA.next == node && nodeA.data == node.data))
      return true;

    if (nodeA.data != node.data)
      return false;

    return palindromeHelper(nodeA.next, k + 1);
  }

  public static boolean run(ListNode<Integer> list) {
    if (list == null) return true;

    return palindromeHelper(list, 1);
  }
}
