package JavaOOPs.Abstraction.ShapeAndItsSubclasses;

/*
* In the above examples of Shape and Monster,
* we encountered a problem when we create instances of Shape and Monster and run the getArea() or attack().
* This can be resolved via abstract method and abstract class.

An abstract method is a method with only signature (i.e., the method name, the list of arguments and the return type)
*  without implementation (i.e., the method’s body).
*  You use the keyword abstract to declare an abstract method.
* */

/**
 * A class containing one or more abstract methods is called an abstract class. An abstract class
 * must be declared with a class-modifier abstract. An abstract class CANNOT be instantiated, as its
 * definition is not complete.
 */
/**
 * This abstract superclass Shape contains an abstract method getArea(), to be implemented by its
 * subclasses.
 */

/**
 * This property of the abstract class solves our earlier problem. In other words, you can create
 * instances of the subclasses such as Triangle and Rectangle, and upcast them to Shape (so as to
 * program and operate at the interface level), but you cannot create instance of Shape, which avoid
 * the pitfall that we have faced.
 */
public abstract class Shape {
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

  /** All Shape's concrete subclasses must implement a method called getArea() */
  public abstract double getArea();
}
