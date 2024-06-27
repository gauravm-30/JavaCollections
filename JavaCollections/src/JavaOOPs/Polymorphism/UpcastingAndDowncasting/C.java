package JavaOOPs.Polymorphism.UpcastingAndDowncasting;

public class C extends B {
  public C() { // Constructor
    super();
    System.out.println("Constructed an instance of C");
  }

  @Override
  public String toString() {
    return "This is C";
  }
}
