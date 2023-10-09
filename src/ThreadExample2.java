/**
 * This class demonstrates the use of thread priority in Java.
 * It creates two threads, 't1' and 't2', with different priorities
 * (MAX_PRIORITY and MIN_PRIORITY, respectively) and starts them
 * to showcase how thread scheduling based on priority works.
 */
public class ThreadExample2 {
    public static void main(String[] args) {
        Thread t1 = new A();
        t1.setPriority(Thread.MAX_PRIORITY);

        Thread t2 = new Thread(new B());
        t2.setPriority(Thread.MIN_PRIORITY);

        t2.start();
        t1.start();
    }
}
