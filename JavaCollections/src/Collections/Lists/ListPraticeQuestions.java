package Collections.Lists;

import java.util.*;

public class ListPraticeQuestions {
    public static void main(String[] args) {
    List<Integer> integerList = new ArrayList<>();
        var m1=integerList.add(null);
        var m2= integerList.add(null);
        for(Integer integer: integerList){
      System.out.println("integer = " + integer);
        }
        integerList.stream().forEach(System.out::println);


        List<Integer> linkedList=new LinkedList<>();
        linkedList.add(20);
        linkedList.add(50);
        linkedList.add(20);

        //it will iterate through the linked list one by one ;
        var m3 = linkedList.get(2);

        for (Integer nums : linkedList){
            System.out.println("nums = " + nums);
        }


//        List<String> names = new ArrayList<>();
//        names.add("Alice");
//        names.add("Bob");
//
//// Attempting to remove an element during iteration
//        for (String name : names) {
//            if (name.equals("Alice")) {
//                names.remove(name); // Throws ConcurrentModificationException
//            }
//        }

        List<String> names2 = new ArrayList<>();
        names2.add("Alice");
        names2.add("Bob");
        names2.add("Charlie");

//        // Modifying elements using for-each (no error)
//        for (String name : names2) {
//            System.out.println("Original name: " + name);
//            //it is creating the new object and assigning it to name
//            name = name.toUpperCase(); // Modify the element
//            System.out.println("Modified name: " + name);
//        }

        //it is giving error Concurrent modification
//        for (String name : names2){
//      if (names2.contains("Bob")){
//          names2.remove(name);}
//        }
        for (String name : names2){
      System.out.println(System.identityHashCode(name));

      //Causes the Charlie not iterable
            if (name.equals("Bob")){
                names2.remove(name);
            }
        }
    System.out.println(names2.size());
        // Verify that the list has been modified
        System.out.println("Updated list: " + names2);

        String s1= names2.get(1);
        System.out.println(System.identityHashCode(s1));
    }


}
