package JavaOOPs.OverridingOverloading.OverridingWithAbstractClass;

/*
* An abstract class cannot be instantiated directly; it needs to be subclassed by another class.
It can have both abstract methods (methods without bodies) and non-abstract methods (methods with implementations).
Constructors are allowed in abstract classes.
Abstract classes can have data members (variables) and methods.
* */
public abstract class Animal {

  // Since if we make the field private then we can't access it with Dog reference variable. Even
  // though we are able to set this variable value using constructor
  private int numberOfEyes;
  String name;

  public Animal() {
    System.out.println("Creating the generic Animal");
  }

  public Animal(int numberOfEyes, String name) {
    System.out.println("Creating the generic Animal (superclass) with parameters");
    this.numberOfEyes = numberOfEyes;
    this.name = name;
  }

  public abstract void danger();

  // Static method can be overloaded
  public static void printNumber() {
    System.out.println("Hello Number 1");
  }

  public static void printNumber(String n1) {
    System.out.println("Hello Number 2");
  }

  /*  public static int printNumber(String s2) {
    return 1;
  }*/

  public void speak() {
    System.out.println("Generic Animal Speaking");
  }

  public void walk() {
    System.out.println("Generic Animal walking");
  }
}
