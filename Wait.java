public class Wait {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object(); // Create an object to use as a lock

        synchronized (lock) {
            System.out.println("Before wait");
            lock.wait(); // Wait indefinitely until notified
            System.out.println("After wait");
        }
    }
}
