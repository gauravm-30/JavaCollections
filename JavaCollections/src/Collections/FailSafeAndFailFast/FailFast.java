package Collections.FailSafeAndFailFast;

import java.util.*;

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
