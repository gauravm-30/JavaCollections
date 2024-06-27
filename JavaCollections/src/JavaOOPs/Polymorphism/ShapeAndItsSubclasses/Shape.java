package JavaOOPs.Polymorphism.ShapeAndItsSubclasses;

/**
 * Polymorphism is very powerful in OOP to separate the interface and implementation so as to allow
 * the programmer to program at the interface in the design of a complex system.
 */

/*
 * Consider the following example.
 *  Suppose that our program uses many kinds of shapes, such as triangle, rectangle and so on.
 *  We should design a superclass called Shape,
 *  which defines the public interfaces (or behaviors) of all the shapes.
 * For example, we would like all the shapes to have a method called getArea(),
 *  which returns the area of that particular shape. The Shape class can be written as follow.
 * */

/*
 * Learn Design Patterns to program at interface level
 * */
/*
 * In this way, we achieve flexibility, maintainability, and extensibility
 *  by programming to the common interface provided by the superclass
 * */

/*
 * The beauty of this code is that all the references are from the superclass (i.e., programming at the interface level).
 * You could instantiate different subclass instance, and the code still works.
 * You could extend your program easily by adding in more subclasses, such as Circle, Square, etc, with ease.
 * */

/*
 *Superclass defines the expected behaviours of all the subclasses
 *Program at the interface level
 * https://www.baeldung.com/cs/program-to-interface
 * */
// Superclass Shape maintain the common properties of all shapes

public class Shape {
  // Private member variable
  private String color;

  /** Constructs a Shape instance with the given color */
  public Shape(String color) {
    this.color = color;
  }

  /** Returns a self-descriptive string */
  @Override
  public String toString() {
    return "Shape[color=" + color + "]";
  }

  /** All shapes must provide a method called getArea() */

  // Important
  public double getArea() {
    // We have a problem here!
    // We need to return some value to compile the program.
    System.err.println("Shape unknown! Cannot compute area!");
    return 0;
  }
}
