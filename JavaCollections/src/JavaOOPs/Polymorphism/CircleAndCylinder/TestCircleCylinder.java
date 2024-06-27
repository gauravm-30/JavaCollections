package JavaOOPs.Polymorphism.CircleAndCylinder;

public class TestCircleCylinder {
  /*
   * Cylinder is a subclass of Circle.
   * We can say that Cylinder "is-a" Circle (actually, it "is-more-than-a" Circle).
   * Subclass-superclass exhibits a so called "is-a" relationship.
   * */

  public static void main(String[] args) {
    /*
    Via substitutability, we can create an instance of Cylinder,
    and assign it to a Circle (its superclass) reference, as follows:
    * */

    // Substitute a subclass instance to a superclass reference
    Circle c1 = new Cylinder(1.1, 2.2);

    // You can invoke all the methods defined in the Circle class for the reference c1,
    // (which is actually holding a Cylinder object), e.g.
    // Invoke superclass Circle's methods
    System.out.println(c1.getRadius());

    // This is because a subclass instance possesses all the properties of its superclass.
    // However, you CANNOT invoke methods defined in the Cylinder class for the reference c1, e.g.

    // CANNOT invoke method in Cylinder as c1 is a Circle reference
    //        c1.getHeight();
    // compilation error: cannot find symbol method getHeight()
    //      c1.getVolume();
    // compilation error: cannot find symbol method getVolume()

    // This is because c1 is a reference to the Circle class,
    // which does not know about methods defined in the subclass Cylinder.

    // c1 is a reference to the Circle class, but holds an object of its subclass Cylinder. The
    // reference c1, however, retains its internal identity. In our example, the subclass Cylinder
    // overrides methods getArea() and toString(). c1.getArea() or c1.toString() invokes the
    // overridden version defined in the subclass Cylinder, instead of the version defined in
    // Circle. This is because c1 is in fact holding a Cylinder object internally.

    System.out.println(c1.toString()); // Run the overridden version
    // Cylinder[height=1.1,Circle[radius=2.2]]
    System.out.println(c1.getArea()); // Run the overridden version
    // 15.205308443374602
  }
}
