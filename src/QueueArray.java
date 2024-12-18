public class QueueArray {

        private int[] queue;  // Array to hold the queue elements
        private int front;    // Points to the front of the queue
        private int rear;     // Points to the rear of the queue
        private int capacity; // Capacity of the queue

        // Constructor to initialize the queue
        public QueueArray(int size) {
            queue = new int[size];
            capacity = size;
            front = 0;
            rear = -1;
        }

        // Enqueue operation to add an element to the queue
        public void enqueue(int item) {
            if (rear == capacity - 1) {  // If the rear is at the last position, queue is full
                System.out.println("Queue is full");
            } else {
                rear++;
                queue[rear] = item;
                System.out.println(item + " enqueued to the queue.");
            }
        }





        // Dequeue operation to remove an element from the queue
        public int dequeue() {
            if (isEmpty()) {  // If front has passed rear, the queue is empty
                System.out.println("Queue is empty");
                return -1;    // Returning -1 to indicate queue is empty
            } else {
                int item = queue[front];
                front++;
                System.out.println(item + " dequeued from the queue.");
                return item;
            }
        }

        // Method to check if the queue is empty
        public boolean isEmpty() {
            return front > rear;
        }

        // Peek operation to view the front element of the queue
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;  // Returning -1 to indicate queue is empty
            } else {
                return queue[front];
            }
        }

        // Main method to test the queue operations
        public static void main(String[] args) {
            QueueArray queue = new QueueArray(5);  // Initialize a queue with size 5

            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);
            queue.enqueue(40);
            queue.enqueue(50);

            System.out.println("Front element: " + queue.peek());

            queue.dequeue();
            queue.dequeue();

            System.out.println("Front element after two dequeues: " + queue.peek());

            queue.enqueue(60);  // Adding another element after dequeue operations

            while (!queue.isEmpty()) {
                queue.dequeue();
            }

            queue.peek();  // Peek on an empty queue
        }

    }

