package linked_lists;

public class SumLists {
  private static int[] getSumAndPlus(int valA, int valB, int plus) {
    int sum = valA + valB + plus;

    if (sum >= 10) {
      sum = sum % 10;
      plus = 1;
    } else {
      plus = 0;
    }

    return new int[]{sum, plus};
  }

  private static ListNode<Integer> reverseOrderHelper(ListNode<Integer> list1, ListNode<Integer> list2, int plus) {
    if (list1 == null && list2 == null) {
      return null;
    }

    int[] values; // to save the result [sum, plus] of the sum of two digits
    int sum;

    if (list1 == null || list2 == null) {
      ListNode<Integer> aux = (list1 == null) ? list2 : list1;
      values = getSumAndPlus(aux.data, 0, plus);
      sum = values[0];
      plus = values[1];

      ListNode<Integer> node = new ListNode<Integer>(sum);
      node.next = (list1 == null)
        ? reverseOrderHelper(list1, aux.next, plus)
        : reverseOrderHelper(aux.next, list2, plus);
      
      return node;
    }
    
    values = getSumAndPlus(list1.data, list2.data, plus);
    sum = values[0];
    plus = values[1];

    ListNode<Integer> node = new ListNode<Integer>(sum);
    node.next = reverseOrderHelper(list1.next, list2.next, plus);
    return node;
  }

  public static ListNode<Integer> reverseOrder(ListNode<Integer> list1, ListNode<Integer> list2) {
    return reverseOrderHelper(list1, list2, 0);
  }
}
