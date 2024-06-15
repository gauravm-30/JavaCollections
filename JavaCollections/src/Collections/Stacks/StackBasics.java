package Collections.Stacks;

public class StackBasics {
  /*
      * When it comes to using a stack in the Java Collections Framework, there are a couple of options: the `Stack` class and the `Deque` interface. Let's explore both and understand why you might prefer one over the other:

  1. **Stack Class**:
      - The `Stack` class is a legacy class that inherits from `Vector`. It models a stack data structure based on the **last-in-first-out (LIFO)** principle.
      - It provides basic push and pop operations, along with additional functions like `empty`, `search`, and `peek`.
      - However, there are some drawbacks:
          - **Inheritance**: The fact that `Stack` extends `Vector` is somewhat unusual. In early Java, inheritance was overused, and this design choice can be confusing.
          - **Specific Implementation**: When you use `Stack`, you're locked into a specific concrete class. This lack of flexibility can be limiting.
          - **Access by Position**: `Stack` allows you to access elements by position (like an array), which isn't always necessary for a stack.
      - Overall, the `Stack` class is less consistent and less flexible compared to the alternatives.

  2. **Deque Interface**:
      - The `Deque` (double-ended queue) interface was introduced in Java 1.6. It defines a more complete and consistent set of LIFO operations.
      - Advantages of using `Deque`:
          - **Interface**: Unlike `Stack`, `Deque` is an interface. You can implement it using various classes, providing more flexibility.
          - **Consistent Operations**: `Deque` exposes a set of operations specifically designed for adding, removing, and iterating over elements at both ends of the collection.
          - **No Access by Position**: Unlike `Stack`, `Deque` deliberately avoids direct access to elements by position. This design choice promotes better encapsulation.
          - **Thread Safety**: If you don't need synchronized behavior (which `Stack` provides), you can use an unsynchronized implementation of `Deque`, such as `ArrayDeque`.
          - **Better Locality of Reference**: `ArrayDeque` (an implementation of `Deque`) is likely faster than `Stack` when used as a stack⁵. It has better memory locality due to its array-based implementation.
          - **Reverse Iteration Order**: `Deque` iterates from first (head) to last (tail), whereas `Stack` iterates in the opposite order.

  In summary, I recommend using the `Deque` interface (e.g., `ArrayDeque`) over the `Stack` class. It provides better consistency, flexibility, and performance advantages. If you're looking for a stack-like behavior, `Deque` can serve that purpose efficiently⁷. 😊

  Source: Conversation with Copilot, 3/6/2024
  (1) java - Why should I use Deque over Stack? - Stack Overflow. https://stackoverflow.com/questions/12524826/why-should-i-use-deque-over-stack.
  (2) Java Stack vs Deque: Which One Should You Choose? [2024]. https://stackinterface.com/java-stack-vs-deque/.
  (3) Stack Class in Java - GeeksforGeeks. https://www.geeksforgeeks.org/stack-class-in-java/.
  (4) Quick Guide to Java Stack | Baeldung. https://www.baeldung.com/java-stack.
  (5) What is the Stack in Java? [2024] - Stack Interface. https://stackinterface.com/what-is-the-stack-in-java/.
  (6) Java Collections Framework - A Quick and In-Depth Look (Part - 1). https://dev.to/alphaaman/java-collections-framework-a-quick-and-in-depth-look-part-1-2mi0.
  (7) java - How is ArrayDeque faster than stack? - Stack Overflow. https://stackoverflow.com/questions/23908511/how-is-arraydeque-faster-than-stack.
  (8) Java Deque vs. Stack - HappyCoders.eu. https://www.happycoders.eu/algorithms/java-deque-vs-stack/.
  (9) Java Deque vs. Stack | Baeldung. https://www.baeldung.com/java-deque-vs-stack.
      * */

  // Locality of reference
  /*
      * Certainly! Let's consider an example where **locality of reference** plays a significant role in optimizing memory access. We'll explore how caching and memory hierarchy benefit from this concept.

  Suppose we have a simple Java program that calculates the sum of elements in an array. Here's a straightforward implementation:

  ```java
  public class ArraySumExample {
      public static void main(String[] args) {
          int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
          int sum = 0;

          for (int i = 0; i < numbers.length; i++) {
              sum += numbers[i];
          }

          System.out.println("Sum of array elements: " + sum);
      }
  }
  ```

  In this program:
  - We create an array `numbers` containing integers from 1 to 10.
  - The `for` loop iterates through each element of the array and accumulates their sum in the `sum` variable.

  Now, let's discuss how **locality of reference** comes into play:

  1. **Temporal Locality**:
     - As the loop iterates, it repeatedly accesses elements of the `numbers` array sequentially.
     - The same memory locations (the array elements) are accessed repeatedly during the loop execution.
     - Caching mechanisms (such as CPU caches) take advantage of this temporal locality by storing recently accessed data in faster memory (e.g., L1 cache).
     - Subsequent iterations can retrieve the data from the cache, reducing the time spent fetching data from slower memory (e.g., main RAM).

  2. **Spatial Locality**:
     - The array elements are stored in contiguous memory locations.
     - When the loop accesses `numbers[i]`, it also loads nearby elements into the cache.
     - For example, if `numbers[0]` is accessed, neighboring elements like `numbers[1]` and `numbers[2]` are likely to be loaded into the cache.
     - This spatial locality minimizes cache misses and improves overall performance.

  In summary, the locality of reference in this example ensures efficient memory access patterns, benefiting both temporal and spatial locality. Modern CPUs and memory hierarchies rely on these principles to optimize performance. 🚀

  Remember that understanding and leveraging locality of reference is crucial when designing algorithms, data structures, and memory-intensive applications. It allows us to write code that takes full advantage of the underlying hardware architecture. 😊👍 .

  Source: Conversation with Copilot, 3/6/2024
  (1) github.com. https://github.com/barryhanna/java-challenges/tree/c4b5aa31b0849ea424b8841a68855c9a2506792f/Challenge13.java.
  (2) github.com. https://github.com/stcady/data-structures-and-algorithms/tree/e7cf01fb85d496ee2c4a50feaa3b97db2de669fe/class%2Fbook%2FJava%2FLanguage%20and%20Collections%2FForDemo.java.
      * */

  /* ArrayDeque Vs LinkedList
    * When considering whether to use a `LinkedList` or an `ArrayDeque` for implementing a stack in Java, let's explore the advantages and differences between the two:

  1. **`ArrayDeque`**:
      - **Efficiency**: The `ArrayDeque` class is more efficient than `LinkedList` for stack-like behavior. It provides better performance due to its array-based implementation and better **locality of reference**⁶.
      - **Single-Threaded Environment**: If you're working in a single-threaded environment (which is often the case), `ArrayDeque` is a better choice. It avoids unnecessary synchronization overhead that `LinkedList` introduces.
      - **Consistent Operations**: `ArrayDeque` follows the `Deque` interface, providing consistent operations for adding, removing, and iterating over elements at both ends.
      - **No Access by Position**: Unlike `LinkedList`, `ArrayDeque` deliberately avoids direct access to elements by position, promoting better encapsulation.
      - **Reverse Iteration Order**: When you iterate over an `ArrayDeque`, it returns elements from first (head) to last (tail), which aligns with the expected LIFO behavior of a stack.

  2. **`LinkedList`**:
      - **Versatility**: `LinkedList` is more versatile due to its list capabilities. It supports both list functionalities and deque operations.
      - **Dynamic Capacity**: You can theoretically always add more elements to a `LinkedList`, making it more flexible in terms of capacity.
      - **Random Access**: `LinkedList` allows index-based access, which can be useful in certain scenarios.
      - **Memory Overhead**: However, `LinkedList` consumes more memory compared to `ArrayDeque`.

  In summary, if you prioritize efficiency, consistent stack operations, and a single-threaded environment, **use `ArrayDeque`**. If you need more versatility and list-like features, `LinkedList` might be a better fit. Remember that the `Deque` interface provides a more flexible and consistent way to implement a stack compared to the legacy `Stack` class¹⁷. 😊

  Source: Conversation with Copilot, 3/6/2024
  (1) Stack, Queue, Deque in Java - HappyCoders.eu. https://www.happycoders.eu/algorithms/stack-queue-deque-java/.
  (2) java - Why is ArrayDeque better than LinkedList - Stack Overflow. https://stackoverflow.com/questions/6163166/why-is-arraydeque-better-than-linkedlist.
  (3) Stack Implementation in Java [2023]: A Comprehensive Guide. https://stackinterface.com/stack-implementation-in-java/.
  (4) Difference Between ArrayDeque and LinkedList in Java. https://www.mastercoding.org/java-qa/difference-between-arraydeque-and-linkedlist-in-java/.
  (5) java - Is linkedList a stack? what is the best implementation of stack .... https://stackoverflow.com/questions/32145126/is-linkedlist-a-stack-what-is-the-best-implementation-of-stack-data-structure.
  (6) Implement Stack and Queue using Deque - GeeksforGeeks. https://www.geeksforgeeks.org/implement-stack-queue-using-deque/.
  (7) Stack Class in Java - GeeksforGeeks. https://www.geeksforgeeks.org/stack-class-in-java/.
    * */

}
