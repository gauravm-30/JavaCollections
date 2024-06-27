package JavaOOPs.Inheritance;

import JavaOOPs.Inheritance.CircleAndCylinder.Cylinder;

public class InheritanceIntro {
  /*
   * In OOP, we often organize classes in hierarchy to avoid duplication and reduce redundancy.
   * The classes in the lower hierarchy inherit all the variables (static attributes) and methods (dynamic behaviors) from the higher hierarchies.
   * A class in the lower hierarchy is called a subclass (or derived, child, extended class).
   *  A class in the upper hierarchy is called a superclass (or base, parent class).
   *  By pulling out all the common variables and methods into the superclasses,
   *  and leave the specialized variables and methods in the subclasses,
   *  redundancy can be greatly reduced or eliminated as these common variables and methods do not need to be repeated in all the subclasses.
   * */

  /*
   * Variable hiding (when parent and child have variable with same name )
   * is different from information/data hiding(where we hide the object state by making it private )
   * */

  /*
   * Rule of Thumb: Use composition if possible, before considering inheritance.
   * Use inheritance only if there is a clear hierarchical relationship between classes
   * */

  public static void main(String[] args) {
    Cylinder cylinder = new Cylinder();
    System.out.println(cylinder);
  }
}
