package JavaOOPs.OverridingOverloading.OverridingStaticMethodAndVariables;

/*
* Certainly! In Java, a subclass can indeed access the **static variables** (also known as class variables) of its superclass. Let's dive into the details:

1. **Static Variables**:
   - Static variables are associated with the class itself, rather than with individual instances (objects) of the class.
   - They are declared using the `static` keyword and are shared among all instances of the class.
   - When you modify a static variable in one instance, the change is reflected in all other instances as well.

2. **Accessing Static Variables in Subclasses**:
   - A subclass can directly access the static variables of its superclass using the superclass name followed by the dot (`.`) operator.
   - The syntax to access a static variable from a subclass is: `SuperclassName.staticVariableName`.

3. **Example**:
   ```java
   class Animal {
       static String species = "Mammal"; // Static variable

       // Other members and methods...
   }

   class Dog extends Animal {
       void displaySpecies() {
           System.out.println("Species (from Animal class): " + Animal.species);
       }
   }

   public class Main {
       public static void main(String[] args) {
           Dog myDog = new Dog();
           myDog.displaySpecies(); // Accessing static variable from Dog class
       }
   }
   ```
   Output:
   ```
   Species (from Animal class): Mammal
   ```

4. **Important Points**:
   - Subclasses can also declare their own static variables with the same name as the superclass's static variables. In such cases, the subclass variable shadows the superclass variable.
   - If you modify the static variable in the subclass, it won't affect the superclass's static variable (they remain independent).

Remember that static variables are shared across the entire class hierarchy, so any changes made to them are visible to all subclasses and instances. 😊🐾
* */
public abstract class Animal {
  //  By default, static variables in an abstract class are not automatically marked as final

  // Since if we make the field private then we can't access it with Dog reference variable. Even
  // though we are able to set this variable value using constructor
  // By default , fields are static and final in interface
  static int numberOfEyes = 10;
  String name;

  public Animal() {}

  public Animal(String name) {
    this.name = name;
  }

  public abstract void danger();

  public abstract void speak();

  // Non-static method can consume static variables but vice verse is not true
  //
  public void walk() {
    System.out.println("Generic Animal walking");
  }
}
