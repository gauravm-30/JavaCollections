package Collections.Queues;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePracticeQuestions {

    public static void main(String[] args){
        Comparator<Integer> integerComparator= Comparator.comparingInt(e -> e);

        //Priority queue
        //use to implement the Heap

        Queue<Integer> q1= new PriorityQueue<>(integerComparator);
        q1.add(20);
        q1.add(10);
        q1.add(30);
        q1.add(11);

    q1.forEach(System.out::println);
  }
}
