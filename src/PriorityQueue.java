import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
public class PriorityQueue {
    public static void main(String[] args) {

        Queue <Double> queueUp = new java.util.PriorityQueue<>();

        queueUp.add(34.2);
        queueUp.add(12.23);
        queueUp.add(9.34);
        queueUp.add(45.76);
        queueUp.add(32.34);

        System.out.println(queueUp);

        while(!queueUp.isEmpty()){
            System.out.println(queueUp.poll());
        }


        Queue <Double> queueUp2 = new java.util.PriorityQueue<>(Collections.reverseOrder());

        queueUp2.add(34.2);
        queueUp2.add(12.23);
        queueUp2.add(9.34);
        queueUp2.add(45.76);
        queueUp2.add(32.34);

        System.out.println(queueUp);

        while(!queueUp2.isEmpty()){
            System.out.println(queueUp2.poll());
        }







    }

}
