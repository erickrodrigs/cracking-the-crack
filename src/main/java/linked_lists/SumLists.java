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

  private static SumNode fowardOrderHelper(ListNode<Integer> list1, ListNode<Integer> list2) {
    SumNode subsum;
    int[] values;
    int sum, plus;

    if (list1.next == null && list2.next == null) {
      values = getSumAndPlus(list1.data, list2.data, 0);
      sum = values[0];
      plus = values[1];
      subsum = new SumNode(sum, plus);
      subsum.next = null;
      return subsum;
    }

    if (list1.next != null && list2.next == null) {
      subsum = fowardOrderHelper(list1.next, list2);
      values = getSumAndPlus(list1.data, 0, subsum.plus);
    } else if (list1.next == null && list2.next != null) {
      subsum = fowardOrderHelper(list1, list2.next);
      values = getSumAndPlus(0, list2.data, subsum.plus);
    } else {
      subsum = fowardOrderHelper(list1.next, list2.next);
      values = getSumAndPlus(list1.data, list2.data, subsum.plus);
    }

    sum = values[0];
    plus = values[1];

    SumNode newSum = new SumNode(sum, plus);
    newSum.next = subsum;
    return newSum;
  }

  public static ListNode<Integer> reverseOrder(ListNode<Integer> list1, ListNode<Integer> list2) {
    return reverseOrderHelper(list1, list2, 0);
  }

  public static ListNode<Integer> forwardOrder(ListNode<Integer> list1, ListNode<Integer> list2) {
    if (list1 == null) return list2;
    if (list2 == null) return list1;

    SumNode sum = fowardOrderHelper(list1, list2);

    if (sum.plus == 1) {
      SumNode extra = new SumNode(sum.plus, 0);
      extra.next = sum;
      sum = extra;
    }

    ListNode<Integer> answer = new ListNode<Integer>(sum.sum);
    ListNode<Integer> previous = answer;
    SumNode node = sum.next;

    while (node != null) {
      ListNode<Integer> newNode = new ListNode<Integer>(node.sum);
      previous.next = newNode;
      previous = newNode;
      node = node.next;
    }

    return answer;
  }

  private static class SumNode {
    private int sum;
    private int plus;
    private SumNode next;

    private SumNode(int sum, int plus) {
      this.sum = sum;
      this.plus = plus;
    }
  }
}
