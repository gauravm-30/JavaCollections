package Collections.ComparatorComparable;


public class Student implements Comparable<Student> {
  int roll_no;

  String name;

  int age;

  Address address;

  public Student(int roll_no, String name, int age) {
    this.roll_no = roll_no;
    this.name = name;
    this.age = age;
  }

  public Student(int roll_no, String name, int age, Address address) {
    this.roll_no = roll_no;
    this.name = name;
    this.age = age;
    this.address = address;
  }

  @Override
  public int compareTo(Student student) {
    return 0;
  }
}

class Address {

  String streetNo;

  int houseNo;

  public Address(String streetNo, int houseNo) {
    this.streetNo = streetNo;
    this.houseNo = houseNo;
  }
}
