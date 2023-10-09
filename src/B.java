/**
 * Class `B` extends `ThreadExample` and implements the `Runnable` interface.
 * It overrides the `run` method to perform a simple multithreading operation.
 */
public class B extends ThreadExample implements Runnable {
    @Override
    public void run() {
        System.out.println("Java supports multithreading");
        B b = new B();
        b.printName("Manoj");
    }
}
