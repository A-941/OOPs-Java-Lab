class IntegerStack {
    private int[] stack;
    private int top;
    private int capacity;

    public IntegerStack(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }

    public synchronized void push(int value) throws InterruptedException {
        while (top == capacity - 1) {
            System.out.println("Stack Full. Producer waiting...");
            wait();
        }
        stack[++top] = value;
        System.out.println("Produced and pushed: " + value + " (Stack size: " + (top + 1) + ")");
        notifyAll();
    }

    public synchronized int pop() throws InterruptedException {
        while (top == -1) {
            System.out.println("Stack Empty. Consumer waiting...");
            wait();
        }
        int value = stack[top--];
        System.out.println("Consumed and popped: " + value + " (Stack size: " + (top + 1) + ")");
        notifyAll();
        return value;
    }
}

class Producer implements Runnable {
    private IntegerStack stack;
    private int count;

    public Producer(IntegerStack stack, int count) {
        this.stack = stack;
        this.count = count;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= count; i++) {
                stack.push(i * 10);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable {
    private IntegerStack stack;
    private int count;

    public Consumer(IntegerStack stack, int count) {
        this.stack = stack;
        this.count = count;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= count; i++) {
                stack.pop();
                Thread.sleep(150);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class Program4_ProducerConsumerStack {
    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack(3);

        Thread producerThread = new Thread(new Producer(stack, 6));
        Thread consumerThread = new Thread(new Consumer(stack, 6));

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Producer-Consumer simulation completed.");
    }
}
