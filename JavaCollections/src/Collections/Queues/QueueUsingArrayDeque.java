package Collections.Queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueUsingArrayDeque {

  /*
   * From ArrayDeque implementation class
   * Resizable-array implementation of the Deque interface.
   * Array deques have no capacity restrictions; they grow as necessary to support usage.
   * They are not thread-safe; in the absence of external synchronization,
   * they do not support concurrent access by multiple threads.
   *  Null elements are prohibited.
   * This class is likely to be faster than Stack when used as a stack,
   * and faster than LinkedList when used as a queue
   * Null element not allowed here
   * */
  Deque<Integer> integerQueue = new ArrayDeque<>();
}
