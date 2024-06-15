package JavaOOPs.DeepCopyShallowCopy.CloneableInterface;

import java.util.ArrayList;
import java.util.List;

public class CloneableDemo {
  public static void main(String[] args) throws CloneNotSupportedException {
    Course c1 = new Course(1, "Maths");
    Student s1 = new Student(1, "MauryaG", c1);

    List<Integer> l1 = new ArrayList<>();
    l1.add(2);
    l1.add(3);
    l1.add(4);
    l1.add(5);

    Student s2 =
        s1.clone(); // will just do shallow copy until we implement cloneable on course object
    // and use course clone in student clone method

    // Since course object havn't implemented the cloneable interface .That's why getting same
    // hashcode
    System.out.println("s2 course hashcode " + s2.getCourse().hashCode());
    System.out.println("s1 course hashcode " + s1.getCourse().hashCode());

    // If we implement the cloneable interface into the course object and call course.clone in
    // student.clone then it will create a deep copy
    System.out.println("s2 course hashcode " + s2.getCourse().hashCode());
    System.out.println("s1 course hashcode " + s1.getCourse().hashCode());
  }
}
