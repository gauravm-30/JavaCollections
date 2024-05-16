package JavaOOPs.DeepCopyShallowCopy;

// Object cloning means copying of object
// Two ways to copy the object
// Shallow copy and Deep copy
// Mostly used in Prototype Design Pattern

public class ShallowCopy {
  public static void main(String[] args) {
    Course c1 = new Course(1, "Maths");
    Student s1 = new Student(1, "Gaurav", c1);

    // creating new object and copying values from student s1
    Student s2 = new Student();
    s2.setId(s1.getId());
    s2.setName(s1.getName());
    // here it will copy the reference only so student s1 and s2 are referencing to same course
    // object
    s2.setCourse(s1.getCourse());
    // Values before doing changes
    System.out.println("***************Before changes*****************");
    System.out.println(
        "S1 values hashcode : "
            + System.identityHashCode(s1.getName())
            + " : "
            + System.identityHashCode(s1.getCourse()));
    System.out.println(
        "S2 values hashcode : "
            + System.identityHashCode(s2.getName())
            + " : "
            + System.identityHashCode(s2.getCourse()));

    // Now changing the values of Immutable class like String , Integer , and other wrapper class
    // Here what will happen the new object will be created and stored in string constant pool.
    // THat object reference will be saved in student s2.
    String s2_name = s2.getName().toUpperCase();
    s2.setName(s2_name);

    // In case of course which is mutable, here changes will be reflected in both the s1 and s2
    // object
    Course s2_course = s2.getCourse();
    s2_course.setName("History");

    // After doing changes
    // s2.name reference will be changed as it is String which is immutable but not course reference
    // will be changed
    System.out.println("***************After changes*****************");
    System.out.println(
        "S1 values hashcode : "
            + System.identityHashCode(s1.getName())
            + " : "
            + System.identityHashCode(s1.getCourse()));
    System.out.println(
        "S2 values hashcode : "
            + System.identityHashCode(s2.getName())
            + " : "
            + System.identityHashCode(s2.getCourse()));

    System.out.println("************CourseValueChangedInBothS1AndS2*************");
    System.out.println("S1 Course name : " + s1.getCourse().getName());
    System.out.println("S2 Course name : " + s2.getCourse().getName());
  }
}
