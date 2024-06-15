package Collections.ComparatorComparable;

import java.util.Comparator;

public class StudentComapreUtil {

  Comparator<Object> c1 =
      (s1, s2) -> {
        return 1;
      };

  Comparator<Student> c2 =
      (s1, s2) -> {
        return 0;
      };

  Comparator<Student> c3 =
      (s1, s2) -> {
        return -1;
      };

  Comparator<Student> c4 =
      new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
          return 0;
        }
      };
}
