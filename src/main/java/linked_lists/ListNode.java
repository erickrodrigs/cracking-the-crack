package linked_lists;

public class ListNode<K> {
  public K data;
  public ListNode<K> next;

  public ListNode(K data) {
    this.data = data;
    this.next = null;
  }
}
