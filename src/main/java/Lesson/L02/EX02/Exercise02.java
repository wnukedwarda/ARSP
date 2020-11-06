package Lesson.L02.EX02;

import Lesson.ContentOfEx;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exercise02 {

    public  boolean time1ShorterThanTime2() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        Instant startList = Instant.now();

        list.add(1);
        list.add(3);
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.remove(3);
        list.remove(3);
        list.remove(3);
        list.get(0);
        list.get(2);
        list.get(4);
        list.get(1);

        list.remove(3);
        list.remove(7);
        list.remove(3);
        list.get(0);
        list.get(2);
        list.get(4);
        list.get(1);

        Instant endList = Instant.now();

        long time1 = Duration.between(startList, endList).getNano();
        System.out.println("Execution Time with List: " + time1);

        Instant startLinked = Instant.now();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(3);
        linkedList.add(3);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(3);
        linkedList.add(6);
        linkedList.remove(3);
        linkedList.remove(7);
        linkedList.remove(3);
        linkedList.getFirst();
        linkedList.getLast();
        linkedList.get(4);
        linkedList.get(1);

        Instant endLinked = Instant.now();

        long time2 = Duration.between(startLinked,endLinked).getNano();
        System.out.println("Execution Time with LinkedList: " + time2);
        System.out.print("Answer: ");
        return time1<time2;
    }

    public void solve(){
        System.out.println(ContentOfEx.L02_EX02);
        System.out.println("Code execution time by List is shorter than by LinkedList ?");
        System.out.println(time1ShorterThanTime2());
    }
}
