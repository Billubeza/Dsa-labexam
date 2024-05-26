public class Circle {
        private int[] queue;
        private int front;
        private int rear;
        private int capacity;
    
        public void CircularQueue(int k) {
            capacity = k;
            queue = new int[capacity];
            front = -1;
            rear = -1;
        }
    
        public boolean enqueue(int value) {
            if (isFull()) {
                return false;
            }
            if (isEmpty()) {
                front++;
            }
            rear = (rear + 1) % capacity;
            queue[rear] = value;
            return true;
        }
    
        public boolean dequeue() {
            if (isEmpty()) {
                return false;
            }
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % capacity;
            }
            return true;
        }
    
        public int front() {
            if (isEmpty()) {
                return -1;
            }
            return queue[front];
        }
    
        public int rear() {
            if (isEmpty()) {
                return -1;
            }
            return queue[rear];
        }
    
        public boolean isEmpty() {
            return front == -1;
        }
    
        public boolean isFull() {
            return (rear + 1) % capacity == front;
        }
    }
}
