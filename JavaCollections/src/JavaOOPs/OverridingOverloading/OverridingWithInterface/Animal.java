package JavaOOPs.OverridingOverloading.OverridingWithInterface;

public interface Animal {

  // Since if we make the field private then we can't access it with Dog reference variable. Even
  // though we are able to set this variable value using constructor
  // By default , fields are static and final in interface

  // by default static and final  and is only to this interface scope only
  int numberOfLegs = 14;
  int numberOfEyes = 10;
  String name = "Gaurav";

  public void danger();

  public void speak();

  // we cannot define the static method without body into the interface
  //  public static void m1();

  public default void walk() {
    System.out.println("Generic Animal walking");
  }
}
