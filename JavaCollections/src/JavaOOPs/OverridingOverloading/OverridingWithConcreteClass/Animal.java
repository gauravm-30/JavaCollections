package JavaOOPs.OverridingOverloading.OverridingWithConcreteClass;

public class Animal {

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

  public void speak() {
    System.out.println("Generic Animal Speaking");
  }

  public void walk() {
    System.out.println("Generic Animal walking");
  }
}
