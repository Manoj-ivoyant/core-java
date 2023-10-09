/**
 * Class A extends Thread to demonstrate a simple example of a thread
 * that overrides the run() method to print a message for better resource management.
 */
public class A extends Thread {
    @Override
    public void run() {
        System.out.println("For Better Resource Management");
    }
}
