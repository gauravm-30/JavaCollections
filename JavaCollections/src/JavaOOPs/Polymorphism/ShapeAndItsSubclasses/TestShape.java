package JavaOOPs.Polymorphism.ShapeAndItsSubclasses;

/** A test driver for Shape and its subclasses */

/**
 * The beauty of this code is that all the references are from the superclass (i.e., programming at
 * the interface level). You could instantiate different subclass instance, and the code still
 * works. You could extend your program easily by adding in more subclasses, such as Circle, Square,
 * etc, with ease.
 */
public class TestShape {
  public static void main(String[] args) {
    Shape s1 = new Rectangle("red", 4, 5); // Upcast
    System.out.println(s1); // Run Rectangle's toString()
    // Rectangle[length=4,width=5,Shape[color=red]]
    System.out.println("Area is " + s1.getArea()); // Run Rectangle's getArea()
    // Area is 20.0

    Shape s2 = new Triangle("blue", 4, 5); // Upcast
    System.out.println(s2); // Run Triangle's toString()
    // Triangle[base=4,height=5,Shape[color=blue]]
    System.out.println("Area is " + s2.getArea()); // Run Triangle's getArea()
    // Area is 10.0

    /**
     * Nonetheless, the above definition of Shape class poses a problem, if someone instantiate a
     * Shape object and invoke the getArea() from the Shape object, the program breaks.
     */
    /**
     * This is because the Shape class is meant to provide a common interface to all its subclasses,
     * which are supposed to provide the actual implementation. We do not want anyone to instantiate
     * a Shape instance. This problem can be resolved by using the so-called abstract class.
     */
    // Constructing a Shape instance poses problem!
    Shape s3 = new Shape("green");
    System.out.println(s3);
    // Shape[color=green]
    System.out.println("Area is " + s3.getArea()); // Invalid output
    // Shape unknown! Cannot compute area!
    // Area is 0.0
  }
}
