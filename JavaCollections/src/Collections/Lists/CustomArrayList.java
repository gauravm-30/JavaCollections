package Collections.Lists;

import java.util.ArrayList;

public class CustomArrayList extends ArrayList {
  @Override
  public boolean add(Object o) {
    if (this.contains(o)) {
      return false;
    }
    return super.add(o);
  }

  public static void main(String[] args) {
    ArrayList cal = new CustomArrayList();
    cal.add(5);
    cal.add(5);

    System.out.println(cal.size());
  }
}
