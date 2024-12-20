public class QueueImpByArray {

    private int[] queue; // Array to store queue elements
    private int front;   // Points to the front of the queue
    private int rear;    // Points to the rear of the queue
    private int size;    // Current size of the queue
    private int capacity; // Maximum capacity of the queue

    // Constructor to initialize the queue
    public QueueImpByArray(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to add an element to the queue (enqueue)
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        // Circular increment for rear
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
        System.out.println("Enqueued: " + item);
    }

    // Method to remove an element from the queue (dequeue)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int item = queue[front];
        // Circular increment for front
        front = (front + 1) % capacity;
        size--;
        System.out.println("Dequeued: " + item);
        return item;
    }

    // Method to get the front element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return queue[front];
    }

    // Method to display the queue elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueImpByArray queue = new QueueImpByArray(5); // Create a queue with capacity 5
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display(); // Outputs: 10 20 30
        queue.dequeue();
        queue.display(); // Outputs: 20 30
        System.out.println("Peek: " + queue.peek()); // Outputs: 20
    }
}
