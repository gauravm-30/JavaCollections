package Collections.FailSafeAndFailFast;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {
  public static void main(String[] args) {
    List<String> strings = new CopyOnWriteArrayList<>();
    strings.add("s1");
    strings.add("s2");
    strings.add("s3");
    //    modifyMap();

    // We are creating the iterator on CopyOnWriteArrayList();
    // which will create the iterator over the copy of the CopyOnWriteArrayList();
    // That's why it runs for 3 times even if we remove the element  from the CopyOnWriteArrayList
    Iterator<String> stringIterator = strings.iterator();

    // Fail Safe
    // If we modify the list while iterating the list modCount will increase .So it will immediately
    // create the cloned object of that collection and those changes will be in that cloned object .
    //
    while (stringIterator.hasNext()) {
      // stringIterator.next() check  whether the modification has been done or not using modCount.
      String name = stringIterator.next();
      System.out.println(System.identityHashCode(name));
      if (name.equals("s2")) {
        // remvoing the array element
        strings.remove(name);
        strings.add("s4");
      }
    }

    System.out.println(strings.size());
  }

  public static void modifyMap() {
    Map<Integer, String> stringMap = new ConcurrentHashMap<>();
    stringMap.put(1, "Gaurav");
    stringMap.put(2, "Gaurav1");
    stringMap.put(3, "Gaurav2");

    Iterator<Integer> iterator = stringMap.keySet().iterator();
    // Here is implementation is different, no cloned object is there
    // modified on same object
    // because of the locking mechanism it used is different
    while (iterator.hasNext()) {
      Integer key = iterator.next();
      System.out.println(key + " : " + stringMap.get(key));
      stringMap.remove(3);
      stringMap.remove(3);
      stringMap.put(4, "Gaurav3");
    }
  }
}
