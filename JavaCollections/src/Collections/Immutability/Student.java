package Collections.Immutability;

public class Student {
  final int id;
  String name;

  Student(int id) {
      this.id = id;
  }

  public Student(int id, String name) {
    this.id = id;
    this.name = name;
  }
}
