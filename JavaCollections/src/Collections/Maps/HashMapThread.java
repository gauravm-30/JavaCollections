package Collections.Maps;

import java.util.HashMap;
import java.util.Map;

// Working on Hashmap with concurrent threads
public class HashMapThread extends Thread {
  static Map<Integer, String> map = new HashMap<>();

  @Override
  public void run() {
    try {
      Thread.sleep(1000);
      map.put(100, "GauravM");

    } catch (InterruptedException e) {
      throw new RuntimeException("Child thread is trying to add the element");
    }
  }

  public static void main(String[] args) throws InterruptedException {
    // first we are inserting 3 key value pairs
    map.put(101, "GauravM1");
    map.put(102, "GauravM2");
    map.put(103, "GauravM3");

    // starts the child thread
    Thread t1 = new HashMapThread();
    t1.start();

    // Here map perform lock on entire object( on complete hashmap) i.e. bucket locking
    // if other thread tried to modify the same Hashmap object .It will throw error
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
      System.out.println(entry.getKey());
      Thread.sleep(1000);
    }
    System.out.println(map);
  }
}
