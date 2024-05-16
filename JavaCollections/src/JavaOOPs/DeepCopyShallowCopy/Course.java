package JavaOOPs.DeepCopyShallowCopy;

public class Course implements Cloneable {
  private int id;

  public Course() {}

  private String name;

  public Course(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
