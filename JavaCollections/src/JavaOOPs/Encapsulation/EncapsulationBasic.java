package JavaOOPs.Encapsulation;

/*
 *Certainly! **Encapsulation** in Java is a fundamental concept in object-oriented programming.
 * It allows you to bundle data (instance variables) and methods (functions) that operate on that data into a single unit (class).
 *  By controlling access to this class's methods and data, encapsulation provides several benefits:

1. **Private Instance Variables**: Always mark your class variables as **private** to prevent unauthorized access.
* This ensures that the internal state of an object remains consistent and secure.

2. **Getter and Setter Methods**: Provide **public getter and setter methods** to control access to private data.
* These methods allow you to read and modify the encapsulated variables.
*  You can also enforce data validation or additional logic within these methods¹.

For practical examples, here are some exercises related to encapsulation in Java:

1. **Person Class**:
   - Create a class called `Person` with private instance variables for `name`, `age`, and `country`.
   * Implement public getter and setter methods for accessing and modifying these variables.

2. **BankAccount Class**:
   - Create a class called `BankAccount` with private instance variables for `accountNumber` and `balance`.
   * Provide public getter and setter methods for these variables.

3. **Rectangle Class**:
   - Create a class called `Rectangle` with private instance variables for `length` and `width`.
   *  Implement public getter and setter methods for these variables.

4. **Employee Class**:
   - Create a class called `Employee` with private instance variables for `employee_id`, `employee_name`, and `employee_salary`.
   * Provide public getter and setter methods for `id` and `name`, and a getter method for the formatted salary.

5. **Circle Class**:
   - Create a class called `Circle` with a private instance variable for `radius`.
   * Implement public getter and setter methods for the radius.
   * Additionally, provide methods to calculate the area and perimeter based on the current radius value.

6. **Car Class**:
   - Create a class called `Car` with private instance variables for `company_name`, `model_name`, `year`, and `mileage`.
   *  Allow access to company name, model name, and year through public getter and setter methods.
   *  However, only provide a getter method for mileage.

7. **Student Class**:
   - Create a class called `Student` with private instance variables for `student_id`, `student_name`, and `grades`.
   * Implement public getter and setter methods for `id` and `name`.
   * Additionally, create a method called `addGrade()` to add grades to the `grades` variable while performing validation¹.


Source: Conversation with Copilot, 15/6/2024
(1) Java Encapsulation - Exercises, Practices, Solutions - w3resource. https://www.w3resource.com/java-exercises/encapsulation/index.php.
(2) Encapsulation in JAVA (With Example) – TecAdmin. https://tecadmin.net/encapsulation-in-java/.
(3) Encapsulation Program in Java for Best Practice - Scientech Easy. https://www.scientecheasy.com/2020/05/encapsulation-program-in-java.html/.
(4) Java Encapsulation Tutorial | Developer.com. https://www.developer.com/java/java-encapsulation/.
(5) Encapsulation in Java - GeeksforGeeks. https://www.geeksforgeeks.org/encapsulation-in-java/.
 * */

// Advantages of Encapsulation
/*Certainly! Encapsulation in Java offers several advantages:

1. **Data Hiding**: Encapsulation restricts access to data members by hiding them.
When you declare instance variables as `private`, they can only be accessed within the class.
Public methods (getters and setters) provide controlled access to these variables, ensuring data integrity and consistency¹.

2. **Control Over Data**: By providing only a setter or getter method, you can make a class instance variable as  read-only or write-only.
This flexibility allows you to skip unnecessary getter or setter methods,
giving you better control over your data³.

3. **Improved Code Readability**: Encapsulation hides the internal complexity of a class.
Other classes interacting with it only need to know the public interface (methods),
making the code easier to read, understand, and maintain².

Remember that encapsulation is like a protective shield, preventing unauthorized access to data and promoting better software design! 😊🚀

Source: Conversation with Copilot, 15/6/2024
(1) Encapsulation in Java - GeeksforGeeks. https://www.geeksforgeeks.org/encapsulation-in-java/.
(2) Encapsulation in Java - Javatpoint. https://www.javatpoint.com/encapsulation.
(3) Java Encapsulation Tutorial | Developer.com. https://www.developer.com/java/java-encapsulation/.
(4) Advantages and Disadvantages of Encapsulation in Java. https://www.thejavaprogrammer.com/advantages-and-disadvantages-of-encapsulation-in-java/.
 * */

// Encapsulation (data members,methods(getters+setters+other methods))
// bundled all the  data+methods

// Provides Security to the data members
// Information hiding (hiding of data members or object state  from outside class) i.e. making
// variable private and
// providing the methods getter and setter if required
public class EncapsulationBasic {
  public static void main(String[] args) {}
}
