/**
 * This class showcases thread synchronization in Java.
 * It creates two threads, 't' and 't2', and ensures that 't' finishes its execution
 * before starting 't2 by using the 'join' method. This demonstrates how 'join' can be
 * used to control the sequence of thread execution.
 */
public class ThreadSynchronization {
    public static void main(String[] args) {
        Thread t = new MultipleOfTwo();
        Thread t2 = new MultipleOfTwo();

        t.start();

        try {
            t.join(); // Wait for 't' to finish before starting 't2'
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        t2.start();
    }
}
