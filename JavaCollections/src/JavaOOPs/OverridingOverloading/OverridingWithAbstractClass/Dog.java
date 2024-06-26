package JavaOOPs.OverridingOverloading.OverridingWithAbstractClass;

public class Dog extends Animal {
  int numberOfLegs;

  public Dog(int numberOfEyes, String name, int numberOfLegs) {
    // Calling super class constructor
    super(numberOfEyes, name);
    this.numberOfLegs = numberOfLegs;
    System.out.println("creating the dog using super class and subclass paramters");
  }

  // Below method is equivalent to
  /*
   * public Dog(numberOfLegs){
   * super();
   * this.numberOfLegs=numberOfLegs;
   * }
   * */
  public Dog(int numberOfLegs) {
    // Creating Dog with only subclass variables
    this.numberOfLegs = numberOfLegs;
    System.out.println("Creating Dog with only subclass parameter");
  }

  // Below method is equivalent to
  /*
   * public Dog(){
   * super() //inserted by compiler , constructor chaining i.e. when one constructor calls the another constructor
   * System.out.println("CreatingAnimalDog");
   * }
   * */
  public Dog() {
    System.out.println("Creating Animal Dog");
  }

  public static void printNumber() {
    System.out.println("Hello Number 1");
  }

  @Override
  public void danger() {
    System.out.println("Dogs are not danger animal");
  }

  public void speak() {
    System.out.println("Dog Speaks");
  }

  public void loyalty() {
    System.out.println("Dogs are Loyal");
  }

  public static void main(String[] args) {
    // parent reference with child object
    // It will the constructor of Animal and then of Dog(), constructor chaining
    Animal a1 = new Dog();
    // Since we have taken Animal class reference(parent class reference) so only method and
    // variables present in Animal Class will be available  for the dog and if any method is
    // overriden in Dog class.Then that overriden will be called
    // It will call the subclass 'Dog' method speak()  method overriding
    a1.speak();

    // It will the constructor of Animal and then of Dog(), constructor chaining
    Animal a2 = new Dog(10);
    a2.speak();

    // Now creating only Dog class object with dog class reference
    // Again as Dog as extended the Animal class, so it will call the super class constructor also
    // i.e. constructor chaining
    Dog d1 = new Dog();
    Dog d2 = new Dog(10);

    Dog d3 = new Dog(2, "Doberman", 10);
    // Also dog can access all the public/protected method of its superclass

  }

  /*
    * Yes, when you create an instance of `Dog` using the statement `Animal a1 = new Dog();`, both the constructors of `Dog` and `Animal` classes will be called. Let me explain why:

  1. **Inheritance and Constructors**:
     - When a subclass (like `Dog`) extends a superclass (like `Animal`), it inherits all the members (fields and methods) of the superclass.
     - Constructors are special methods used to initialize objects when they are created. They are called automatically when an object is instantiated.
     - In Java, if a subclass constructor does not explicitly call a superclass constructor using `super(...)`,
     *  the compiler automatically inserts a call to the superclass's default (parameterless) constructor as the first statement in the subclass constructor.

  2. **Constructor Chaining**:
     - In your case, the `Dog` class implicitly calls the parameterless constructor of the `Animal` class (since you haven't explicitly called any superclass constructor).
     - The constructor chaining works as follows:
       1. `Dog` constructor is invoked.
       2. Before executing any code in the `Dog` constructor, the compiler inserts a call to the `Animal` constructor (parameterless) using `super()`.
       3. The `Animal` constructor initializes any fields specific to the `Animal` class.
       4. Then, the `Dog` constructor continues with its own initialization logic.

  3. **Order of Execution**:
     - The superclass constructor (`Animal` constructor) is called before the subclass constructor (`Dog` constructor).
     - So, the sequence of constructor calls is: `Animal` constructor → `Dog` constructor.

  4. **Explicit Superclass Constructor Call**:
     - If you want to explicitly call a specific constructor of the superclass (e.g., a parameterized constructor of `Animal`), you can do so using `super(...)` in the `Dog` constructor.
     - For example:
       ```java
       public Dog() {
           super("Some animal name"); // Explicitly call Animal's parameterized constructor
           // Other initialization logic for Dog
       }
       ```
     Remember that constructor chaining ensures that the superclass's state is properly initialized before the subclass's constructor executes.
  * If you don't explicitly call `super(...)`, the default constructor of the superclass is invoked automatically.
    * */
}
