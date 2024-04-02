public class Volatile {
    private static volatile int counter = 0;

    public static void main(String[] args) {
        // Thread 1: Increments the counter
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter++;
            }
        });

        // Thread 2: Increments the counter
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter++;
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final value of the counter
        System.out.println("Final counter value: " + counter);
    }
}
