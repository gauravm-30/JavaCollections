package JavaOOPs.CheckedAndUncheckedException;

import java.io.*;

public class CheckedException {

  //    In the given scenario, the main method itself does not handle the exception. Instead, it
  // throws the InterruptedException to the source that invoked it. If any unchecked exception
  // occurs in the main method, the program will terminate1. In this specific case, the
  // InterruptedException is propagated up the call stack, and the system runtime handles it

  /*
    * In Java, unchecked exceptions (also known as runtime exceptions) do not require explicit handling. However, it’s essential to understand why:

  Unchecked Exceptions:
  These exceptions extend RuntimeException or its subclasses.
  Examples include NullPointerException, ArrayIndexOutOfBoundsException, and IllegalArgumentException.
  They typically result from programming errors (e.g., null references, invalid array indices).
  Java does not force you to handle them explicitly.
  Why Not Explicit Handling?
  Unchecked exceptions are often unrecoverable. Attempting to handle them might not make sense.
  They propagate up the call stack until caught or until the program terminates.
  Handling them would clutter code unnecessarily.
  When to Handle Unchecked Exceptions:
  If you can recover from an unchecked exception, consider catching it.
  For example, if a method reads from a file and encounters a FileNotFoundException, you might handle it by providing an alternative file or logging an error.
    * */
  public static void main(String[] args) throws InterruptedException, IOException {

    Writer w1 = new BufferedWriter(new FileWriter("abc.txt"));
    w1.write("Gaurav");

    try {

      System.out.println(10 / 0);
    } catch (Exception e) {
      Thread.sleep(1000);
      System.out.println("Hello ");
    } finally {
      System.out.println("Hanji ");
    }

    System.out.println("Good Morning");
  }
}
