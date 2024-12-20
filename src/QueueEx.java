import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {

        Queue<String> newqueue = new LinkedList<>();

        System.out.println(newqueue.isEmpty());

        newqueue.add("gayani");
        newqueue.add("Pamod");
        newqueue.add("Amara");
        newqueue.add("Kamal");

        System.out.println(newqueue);

        newqueue.offer("Sama");
        newqueue.offer("Wimal");
        newqueue.offer("Ama");

        System.out.println(newqueue);
        System.out.println(newqueue.size());
        System.out.println(newqueue.contains("Ama"));
        System.out.println(newqueue.contains("AAAA"));
        System.out.println(newqueue.peek());

        System.out.println(newqueue);
        newqueue.remove();
        System.out.println(newqueue);
        newqueue.poll();
        System.out.println(newqueue);
    }}