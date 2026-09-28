class PriorityWorker extends Thread {
    private String workerName;
    private int start;

    public PriorityWorker(String workerName, int start) {
        this.workerName = workerName;
        this.start = start;
    }

    @Override
    public void run() {
        for (int i = start; i <= 20; i += 2) {
            System.out.println(workerName + " (Priority " + getPriority() + "): " + i);
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class Program2_ThreadPriorityDemo {
    public static void main(String[] args) {
        PriorityWorker evenThread = new PriorityWorker("Even Thread", 2);
        PriorityWorker oddThread = new PriorityWorker("Odd Thread", 1);

        evenThread.setPriority(Thread.MAX_PRIORITY);
        oddThread.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Even Thread Priority: " + evenThread.getPriority());
        System.out.println("Odd Thread Priority: " + oddThread.getPriority());

        evenThread.start();
        oddThread.start();

        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
