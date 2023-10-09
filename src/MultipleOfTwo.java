/**
 * A class that extends the Thread class to perform a task.
 */
public class MultipleOfTwo extends Thread {

    /**
     * The run method is executed when the thread starts.
     * It prints the name of the thread and calculates and prints
     * the multiples of 2 from 1 to 10.
     */
    @Override
    synchronized public void run() {
        // Print the name of the thread that is running this method
        System.out.println(Thread.currentThread().getName() + " is running");

        // Calculate and print multiples of 2 from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("2X" + i + "=" + 2 * i);
        }
    }
}
