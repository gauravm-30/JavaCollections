package Collections.ComparatorComparable;

import java.util.Arrays;
import java.util.List;

public class ComparableDemo {
  public static void main(String[] args) {
    Student s1 = new Student(1, "Gaurav", 25, new Address("aq12", 163));
    Student s2 = new Student(2, "Amit", 27, new Address("qw23", 112));
    StudentComapreUtil sutil = new StudentComapreUtil();
    Integer int1 = 1;
    System.out.println(sutil.c1.compare(s1, s2));
    System.out.println(sutil.c2.compare(s1, s2));
    System.out.println(sutil.c3.compare(s1, s2));

    List<String> sList = Arrays.asList("Gaurav", "AMit", "Puskar", "Pranesh");
    String[] sL = new String[sList.size()];
    for (int i = 0; i < sL.length; i++) {
      sL[i] = sList.get(i);
    }

    Arrays.sort(sL);
    for (String s6 : sL) {
      System.out.println(s6);
    }

    // -1  when s1 < s2
    // 0 when s1=s2
    // 1 when s1>s2

    //    if (s1.compareTo(s2) < 0) {
    //      System.out.println("s2 is larger");
    //    } else if (s1.compareTo(s2) > 0) {
    //      System.out.println("s1 is larger");
    //    } else {
    //      System.out.println("both are equal");
    //    }
  }
}
