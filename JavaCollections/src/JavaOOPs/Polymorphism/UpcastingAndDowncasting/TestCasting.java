package JavaOOPs.Polymorphism.UpcastingAndDowncasting;

public class TestCasting {
  public static void main(String[] args) {
    A a1 = new C(); // upcast
    // Constructed an instance of A
    // Constructed an instance of B
    // Constructed an instance of C
    System.out.println(a1); // run C's toString()
    // This is C
    B b1 = (B) a1; // downcast okay
    System.out.println(b1); // run C's toString()
    // This is C
    C c1 = (C) b1; // downcast okay
    System.out.println(c1); // run C's toString()
    // This is C

    A a2 = new B(); // upcast
    // Constructed an instance of A
    // Constructed an instance of B
    System.out.println(a2); // run B's toString()
    // This is B
    B b2 = (B) a2; // downcast okay
    C c2 = (C) a2;
    // compilation okay because at compile it just check the reference can downcast or not. It
    // doesn't check the runtime object
    // but runtime error:
    // java.lang.ClassCastException: class B cannot be cast to class C
  }

  /*
   * Compiler may not be able to detect error in explicit cast, which will be detected only at
   * runtime. For example,
   *
   * <p>Circle c1 = new Circle(5); Point p1 = new Point();
   *
   * <p>c1 = p1; // here you are assigning reference directly,compilation error: incompatible types (Point is not a subclass of Circle)
   * c1 =(Circle)p1; //here you are downcasting, runtime error: java.lang.ClassCastException: Point cannot be casted to Circle
   */
}
