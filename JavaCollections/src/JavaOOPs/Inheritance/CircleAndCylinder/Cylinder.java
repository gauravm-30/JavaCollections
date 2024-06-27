package JavaOOPs.Inheritance.CircleAndCylinder;

/** A Cylinder is a Circle plus a height. */
public class Cylinder extends Circle {
  // private instance variable
  private double height;

  // Constructors
  public Cylinder() {
    super(); // invoke superclass' constructor Circle()
    this.height = 1.0;
    System.out.println("Constructed a Cylinder with Cylinder()"); // for debugging
  }

  public Cylinder(double height) {
    super(); // invoke superclass' constructor Circle()
    this.height = height;
    System.out.println("Constructed a Cylinder with Cylinder(height)"); // for debugging
  }

  public Cylinder(double height, double radius) {
    super(radius); // invoke superclass' constructor Circle(radius)
    this.height = height;
    System.out.println("Constructed a Cylinder with Cylinder(height, radius)"); // for debugging
  }

  public Cylinder(double height, double radius, String color) {
    super(radius, color); // invoke superclass' constructor Circle(radius, color)
    this.height = height;
    System.out.println(
        "Constructed a Cylinder with Cylinder(height, radius, color)"); // for debugging
  }

  // Getter and Setter
  public double getHeight() {
    return this.height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  // if we want to get or set the width or length  we cn use the getter of Circle as these are
  // accessible
  // by Cylinder class object also

  /** Returns the volume of this Cylinder */
  /*  public double getVolume() {
    return getArea() * height; // Use Circle's getArea()
  }*/

  // overriding methods

  /*
    * A subclass inherits all the member variables and methods from its superclasses (the immediate parent and all its ancestors).
    * It can use the inherited methods and variables as they are.
    * It may also override an inherited method by providing its own version,
    *  or hide an inherited variable by defining a variable of the same name.

  For example, the inherited method getArea() in a Cylinder object computes the base area of the cylinder.
  * Suppose that we decide to override the getArea() to compute the surface area of the cylinder in the subclass Cylinder.
    * */
  @Override
  public double getArea() {
    return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
  }

  // Need to change the getVolume() as well
  public double getVolume() {
    return super.getArea() * height; // use superclass' getArea()
  }

  /** Returns a self-descriptive String */
  // Override the inherited toString()
  @Override
  public String toString() {
    return "Cylinder[" + super.toString() + ",height=" + height + "]";
  }

  /*  public String toString() {
    return "This is a Cylinder"; // to be refined later
  }*/
}
