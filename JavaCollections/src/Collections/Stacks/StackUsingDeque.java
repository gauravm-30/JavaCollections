package Collections.Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

// https://stackoverflow.com/questions/6163166/why-is-arraydeque-better-than-linkedlist
//
public class StackUsingDeque {
  Deque<Integer> dequeInteger = new ArrayDeque<>();

  public void push(Integer e) {
    dequeInteger.push(e);
  }

  public Integer pop() {
    return dequeInteger.pop();
  }

  public Integer peek() {
    return dequeInteger.peek();
  }

  public int getAllElements() {
    return dequeInteger.size();
  }

  public boolean isEmpty() {
    return dequeInteger.isEmpty();
  }

  public boolean contains(Integer e) {
    return dequeInteger.contains(e);
  }
}

// OR directly use the stack operation from the ArrayDeque
