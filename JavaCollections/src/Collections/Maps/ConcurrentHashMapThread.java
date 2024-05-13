package Collections.Maps;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// Working on Hashmap with concurrent threads
public class ConcurrentHashMapThread extends Thread {
  static Map<Integer, String> map = new ConcurrentHashMap<>();

  @Override
  public void run() {
    // Thread.sleeop(1000);
    map.remove(101);
  }

  public static void main(String[] args) throws InterruptedException {
    // first we are inserting 3 key value pairs
    map.put(101, "GauravM1");
    map.put(102, "GauravM2");
    map.put(103, "GauravM3");

    // starts the child thread
    Thread t1 = new ConcurrentHashMapThread();
    t1.start();

    // Here map perform lock on current object() i.e. segment locking
    // if other thread tried to modify the same Hashmap .It will  let the thread to do.
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
      // Here only that entry is locked
      System.out.println(entry.getKey());
      Thread.sleep(1000);
    }
    System.out.println(map);
  }
}
