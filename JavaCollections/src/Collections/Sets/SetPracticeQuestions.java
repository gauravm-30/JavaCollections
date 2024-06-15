package Collections.Sets;

import java.util.HashSet;
import java.util.Set;

public class SetPracticeQuestions {
  public static void main(String[] args) {
    Set<Integer> integerSet = new HashSet<>();
    var m1 = integerSet.add(10);
    // Since hashset internally uses hashtable to store the element .So there is no chance of
    // getting the values using index
    // integerSet.get(index) doesn't exist here
    integerSet.contains(15);

    // we can just iterate the elements and then perform task whichever required
    for (Integer set : integerSet) {
      if (set.equals(10)) {
        integerSet.remove(set);
      }
    }

    integerSet.stream().forEach(System.out::println);
    Set<Student> students = new HashSet<>();
    // Now it will add only two elements as we have overriden the equals and hashcode method
    students.add(new Student(101, "Gaurav"));
    students.add(new Student(101, "Gaurav"));
    students.add(new Student(102, "GauravM"));
    System.out.println("students = " + students);
  }

  public void SetImplementations() {}
}
