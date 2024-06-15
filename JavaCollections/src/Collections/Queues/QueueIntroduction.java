package Collections.Queues;

import java.util.LinkedList;
import java.util.Queue;

// https://www.baeldung.com/java-choose-list-set-queue-map
public class QueueIntroduction {

  /*
      * Certainly! In Java, the **Queue** interface represents a collection of elements in a specific order, following the **first-in, first-out (FIFO)** principle. Elements are retrieved in the order in which they were added to the queue. Let's explore the common implementations of the Queue interface:

  1. **LinkedList**:
     - The `LinkedList` class implements the Queue interface and acts as a queue.
     - It allows efficient insertion and removal of elements from both ends (front and rear).
     - Use `LinkedList` when you need a flexible queue with dynamic resizing capabilities.

  2. **PriorityQueue**:
     - The `PriorityQueue` class also implements the Queue interface.
     - It maintains elements in a priority order (based on their natural order or a custom comparator).
     - Elements are dequeued based on their priority.
     - Use `PriorityQueue` when you need a queue with prioritization.

  3. **ArrayDeque**:
     - The `ArrayDeque` class is another implementation of the Queue interface.
     - It provides a double-ended queue (deque) that allows efficient insertion and removal from both ends.
     - Use `ArrayDeque` when you need a fast and memory-efficient queue.

  Here's how you can create instances of these implementations:

  ```java
  import java.util.LinkedList;
  import java.util.Queue;
  import java.util.PriorityQueue;
  import java.util.ArrayDeque;

  public class QueueExample {
      public static void main(String[] args) {
          // LinkedList implementation of Queue
          Queue<String> linkedListQueue = new LinkedList<>();

          // PriorityQueue implementation of Queue
          Queue<String> priorityQueue = new PriorityQueue<>();

          // ArrayDeque implementation of Queue
          Queue<String> arrayDequeQueue = new ArrayDeque<>();
      }
  }
  ```

  Remember that you can choose the appropriate implementation based on your specific requirements. If you need a simple FIFO queue, go with `LinkedList`. For prioritization, use `PriorityQueue`. And if you want a versatile queue with both front and rear access, consider `ArrayDeque`¹²³⁴. 😊

  Source: Conversation with Copilot, 3/6/2024
  (1) Queue Interface In Java - GeeksforGeeks. https://www.geeksforgeeks.org/queue-interface-java/.
  (2) Queue Interface in Java Collections - BeginnersBook. https://beginnersbook.com/2017/08/queue-interface-in-java-collections/.
  (3) Java Queue Interface - Programiz. https://www.programiz.com/java-programming/queue.
  (4) Choosing the Right Java Collection | Baeldung. https://www.baeldung.com/java-choose-list-set-queue-map.
  (5) The Queue Interface (The Java™ Tutorials > Collections - Oracle. https://docs.oracle.com/javase/tutorial/collections/interfaces/queue.html.
      * */
}
