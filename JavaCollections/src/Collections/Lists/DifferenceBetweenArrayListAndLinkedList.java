package Collections.Lists;

public class DifferenceBetweenArrayListAndLinkedList {
  /*
      *
      * Certainly! Let's explore the differences between `ArrayList` and `LinkedList` in Java:

  1. **Internal Data Structure**:
     - `ArrayList` internally uses a dynamic array to store elements.
     - `LinkedList` internally uses a doubly linked list to store elements.

  2. **Performance**:
     - **ArrayList**:
       - Slower manipulation: When an element is removed from an `ArrayList`, all other elements are shifted in memory due to its array-based structure.
       - Better for storing and accessing data.
     - **LinkedList**:
       - Faster manipulation: No bit shifting is required when elements are added or removed because of its doubly linked list structure.
       - Better for manipulating data.

  3. **Interfaces Implemented**:
     - `ArrayList` implements the `List` interface.
     - `LinkedList` implements both the `List` and `Deque` interfaces, allowing it to act as both a list and a queue.

  4. **Memory Location**:
     - Elements in an `ArrayList` are stored in contiguous memory locations.
     - Elements in a `LinkedList` are not contiguous.

  5. **Default Capacity**:
     - When initialized, an `ArrayList` has a default capacity of 10.
     - A `LinkedList` starts with an empty list.

  6. **Choosing Between Them**:
     - If you need frequent additions/removals, go for `LinkedList`.
     - If read operations are more frequent, prefer `ArrayList`.
     - `ArrayList` is more cache-friendly due to its compact storage.  **important
     - `LinkedList` may have poor cache-locality.

  Here's a simple example using both classes:
  ```java
  import java.util.*;

  class TestArrayLinked {
      public static void main(String[] args) {
          List<String> al = new ArrayList<>(); // Creating an ArrayList
          al.add("Ravi");
          al.add("Vijay");
          al.add("Ravi");
          al.add("Ajay");

          List<String> ll = new LinkedList<>(); // Creating a LinkedList
          ll.add("James");
          ll.add("Serena");
          ll.add("Swati");
          ll.add("Junaid");

          System.out.println("ArrayList: " + al);
          System.out.println("LinkedList: " + ll);
      }
  }
  ```

  Output:
  ```
  ArrayList: [Ravi, Vijay, Ravi, Ajay]
  LinkedList: [James, Serena, Swati, Junaid]
  ```

  Remember:
  - Use `ArrayList` for better data access.
  - Use `LinkedList` for efficient data manipulation¹²³⁴.

  Source: Conversation with Copilot, 26/5/2024
  (1) Difference Between ArrayList and LinkedList - Javatpoint. https://www.javatpoint.com/difference-between-arraylist-and-linkedlist.
  (2) java - Difference between arraylist and linkedList - Stack Overflow. https://stackoverflow.com/questions/11667955/difference-between-arraylist-and-linkedlist.
  (3) Difference Between ArrayList and LinkedList in Java - Stack Abuse. https://stackabuse.com/difference-between-arraylist-and-linkedlist-in-java-code-and-performance/.
  (4) Difference between LinkedList vs. ArrayList in Java - HowToDoInJava. https://howtodoinjava.com/java/collections/arraylist/linkedlist-vs-arraylist/.
  (5) ArrayList vs LinkedList in Java - GeeksforGeeks. https://www.geeksforgeeks.org/arraylist-vs-linkedlist-java/.
  (6) github.com. https://github.com/Akhil-Pathivada/CODING/tree/592c148abfabb938de64d58aaa65ca69ba8af8b2/Core%20JAVA%2F25.%20Collections%2F2.%20ArrayList%2FArrayList_Demo.java.
      * */
}
