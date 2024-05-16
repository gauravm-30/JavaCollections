package Collections.FailSafeAndFailFast;

import java.util.*;

/*
* Certainly! Let's explore the concepts of **fail-fast** and **fail-safe** in Java collections.

1. **Fail-Fast Iterators**:
   - Fail-fast iterators immediately throw a `ConcurrentModificationException` if they detect that the collection has been modified during iteration.
   - These iterators are commonly used with non-concurrent collections, such as `ArrayList` and `HashMap`.
   - When an element is added or removed from the collection while a thread is iterating over it, the fail-fast iterator detects the structural modification and raises an exception.
   - Examples of fail-fast iterators include the standard iterators in `HashMap`, `ArrayList`, and other similar classes.

2. **Fail-Safe Iterators**:
   - Fail-safe iterators, on the other hand, do not throw any exceptions due to concurrent modifications.
   - They operate on a copy of the collection, ensuring that the original collection remains unaffected during iteration.
   - Fail-safe iterators are typically used with concurrent collections, such as `ConcurrentHashMap` and `CopyOnWriteArrayList`.
   - These collections are designed to handle concurrent modifications without causing exceptions.
   - When using a fail-safe iterator, modifications to the collection (additions or removals) do not impact the ongoing iteration.

In summary:
- **Fail-Fast**: Throws exceptions immediately upon detecting concurrent modifications.
- **Fail-Safe**: Operates on a copy of the collection, avoiding exceptions during iteration.

Choose the appropriate iterator based on your use case and the type of collection you're working with. If you have any further questions or need more details, feel free to ask! 😊

References:
1. [Javatpoint: Fail-fast and Fail-safe in Java](https://www.javatpoint.com/fail-fast-and-fail-safe-in-java)
2. [Java Guides: Fail-fast vs. Fail-safe Iterators](https://www.javaguides.net/2023/11/fail-fast-vs-fail-safe-iterators-in-java.html)
3. [Bytes of Gigabytes: Understanding Fail-Fast and Fail-Safe Iterators in Java](https://bytesofgigabytes.com/java/understanding-fail-fast-and-fail-safe-iterators-in-java/)
4. [Java67: What is Fail-Safe and Fail-Fast Iterator in Java?](https://www.java67.com/2015/06/what-is-fail-safe-and-fail-fast-iterator-in-java.html)
5. [GeeksforGeeks: Fail Fast and Fail Safe Iterators in Java](https://www.geeksforgeeks.org/fail-fast-fail-safe-iterators-java/) ¹²³⁴⁵

Source: Conversation with Bing, 14/5/2024
(1) Fail-fast and Fail-safe in Java - Javatpoint. https://www.javatpoint.com/fail-fast-and-fail-safe-in-java.
(2) fail-fast vs fail-safe Iterators in Java - Java Guides. https://www.javaguides.net/2023/11/fail-fast-vs-fail-safe-iterators-in-java.html.
(3) Understanding Fail-Fast and Fail-Safe Iterators in Java: Explained with .... https://bytesofgigabytes.com/java/understanding-fail-fast-and-fail-safe-iterators-in-java/.
(4) What is fail safe and fail fast Iterator in Java? | Java67. https://www.java67.com/2015/06/what-is-fail-safe-and-fail-fast-iterator-in-java.html.
(5) Fail Fast and Fail Safe Iterators in Java - GeeksforGeeks. https://www.geeksforgeeks.org/fail-fast-fail-safe-iterators-java/.
* */
public class FailFast {
  public static void main(String[] args) {
    List<String> strings = new ArrayList<>();
    strings.add("s1");
    strings.add("s2");
    strings.add("s3");
    modifyMap();
    Iterator<String> stringIterator = strings.iterator();

    // It will not give error because after removing the s2 no element is left in the list So next
    // time it will not  enter the loop .So not able to detect the modification.Hence it will not
    // throw error
    while (stringIterator.hasNext()) {
      // stringIterator.next() check  whether the modification has been done or not using modCount.
      String name = stringIterator.next();
      System.out.println(System.identityHashCode(name));
      if (name.equals("s2")) {
        strings.remove(name);
      }
    }

    // Here it will thorw error because after the removal of s1 , list still contains the values so
    // next time it will enter the loop and when it tries to get the next() element then it will
    // find that list has been modified. Hence throw the exception
    while (stringIterator.hasNext()) {
      // stringIterator.next() check  whether the modification has been done or not.
      String name = stringIterator.next();
      System.out.println(System.identityHashCode(name));
      if (name.equals("s1")) {
        strings.remove(name);
      }
    }

    //      for (String name : strings) {
    //            System.out.println(System.identityHashCode(name));
    //            if (name.equals("s2")){
    //                strings.remove(name);
    //            }
    //        }

    //        Iterator<String> iterator=strings.iterator();
    //        while (iterator.hasNext()){
    //            String ele=iterator.next();
    //      System.out.println(ele);
    //      strings.add("s3");

    //        for (String ele : strings) {
    //            System.out.println(ele);
    //            //it will throw error it s3 is present in the list (means list is modified)
    // otherwise not through error means list is not modified
    //            strings.remove("s3");
    //        }

    Map<Integer, String> stringMap = new HashMap<>();
    stringMap.put(1, "Gaurav");
    stringMap.put(2, "Gaurav1");
    stringMap.put(3, "Gaurav2");

    Iterator<Integer> iterator = stringMap.keySet().iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next() + " : " + stringMap.get(iterator.next()));
      stringMap.put(4, "Gaurav3");
    }
  }

  public static void modifyMap() {
    Map<Integer, String> stringMap = new HashMap<>();
    stringMap.put(1, "Gaurav");
    stringMap.put(2, "Gaurav1");
    stringMap.put(3, "Gaurav2");

    Iterator<Integer> iterator = stringMap.keySet().iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next() + " : " + stringMap.get(iterator.next()));
      stringMap.put(4, "Gaurav3");
    }
  }
}
