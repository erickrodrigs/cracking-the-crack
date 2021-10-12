package linked_lists;

public class SinglyLinkedList<T> {
  private ListNode<T> head;
  private ListNode<T> last;
  private int size;

  public SinglyLinkedList() {
    this.head = this.last = null;
    this.size = 0;
  }

  public SinglyLinkedList(ListNode<T> list) {
    this.head = list;
    ListNode<T> node = list;

    while (node != null) {
      this.size += 1;
      this.last = node;
      node = node.next;
    }
  }

  public ListNode<T> getHead() {
    return this.head;
  }

  public void addBegin(T data) {
    ListNode<T> node = new ListNode<>(data);
    
    if (this.size == 0) {
      this.head = node;
      this.last = node;
    } else {
      node.next = this.head;
      this.head = node;
    }

    this.size += 1;
  }
  
  public void addEnd(T data) {
    ListNode<T> node = new ListNode<>(data);
    
    if (this.size == 0) {
      this.head = node;
      this.last = node;
    } else {
      this.last.next = node;
      this.last = node;
    }
    
    this.size += 1;
  }

  @Override
  public String toString() {
    ListNode<T> node = head;
    StringBuilder builder = new StringBuilder();

    while (node != null) {
      if (node.next != null)
        builder.append(node.data + " -> ");
      else
        builder.append(node.data);

      node = node.next;
    }

    return builder.toString();
  }
}
