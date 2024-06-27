package JavaOOPs.Polymorphism.UpcastingAndDowncasting;

/**
 * Upcasting a Subclass Instance to a Superclass Reference Substituting a subclass instance for its
 * superclass is called "upcasting". This is because, in a UML class diagram, subclass is often
 * drawn below its superclass. Upcasting is always safe because a subclass instance possesses all
 * the properties of its superclass and can do whatever its superclass can do. The compiler checks
 * for valid upcasting and issues error "incompatible types" otherwise. For example,
 */

/*
 * Circle c1 = new Cylinder(1.1, 2.2);  // Compiler checks to ensure that R-value is a subclass of L-value.
   Circle c2 = new String();            // Compilation error: incompatible types
   *
*/

/* You can revert a substituted instance back to a subclass reference.
This is called "downcasting". For example,

Circle c1 = new Cylinder(1.1, 2.2);  // upcast is safe
Cylinder cy1 = (Cylinder) c1;        // downcast needs the casting operator
Downcasting requires explicit type casting operator in the form of prefix operator (new-type).
Downcasting is not always safe, and throws a runtime ClassCastException
if the instance to be downcasted does not belong to the correct subclass.
A subclass object can be substituted for its superclass, but the reverse is not true.
 * */
public class UpcastingDowncastingIntro {}
