package JavaOOPs.AccessModifiers;

import JavaOOPs.AccessModifiers.ProtectedPkg.ClassC;
import JavaOOPs.AccessModifiers.ProtectedPkg.ClassD;

public class ClassB extends ClassD {
  public static void main(String[] args) {
    ClassA a = new ClassA();
    System.out.println(a.m1); // accessible by ClassA object within the same package

    ClassC c = new ClassC();
    // c.m1 not accessible from ClassC object as they are in different packages
    ClassD d = new ClassD();
    // d.m1
  }
}
