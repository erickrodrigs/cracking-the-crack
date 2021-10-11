package stacks_and_queues;

public class Program {
  public static void main(String[] args) {
    StackMin stack = new StackMin();

    stack.push(10);
    stack.push(7);
    stack.push(5);
    stack.push(4);
    stack.push(5);

    System.out.println("MIN: " + stack.min());
    stack.pop();
    System.out.println("MIN: " + stack.min());
    stack.pop();
    System.out.println("MIN: " + stack.min());


    System.out.println("EXERCICIO: SetOfStacks");

    SetOfStacks set = new SetOfStacks();

    set.push(1);
    set.push(2);
    set.push(3);
    set.push(4);
    set.push(5);
    set.push(6);
    set.push(7);
    set.push(8);
    set.push(9);
    int elem = set.popAt(1); // 6
    System.out.println("ELEMENTO: " + elem);
    set.printStack();

  }
}
