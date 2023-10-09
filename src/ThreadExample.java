/**
 * This class serves as an example of multithreading in Java.
 * It demonstrates the use of both the 'Thread' class and the 'Runnable' interface
 * to create and start threads for concurrent execution of code.
 */
public class ThreadExample {
    public static void main(String[] args) {
        Thread t = new Welcome();
        t.start();
        Thread t2 = new Thread(new Greeting());
        t2.start();
    }

    public void printName(String name) {
        System.out.println("Your name: " + name);
    }
}

class Welcome extends Thread {
    @Override
    public void run() {
        System.out.println("Welcome!");
    }
}

class Greeting implements Runnable {
    @Override
    public void run() {
        System.out.println("Good morning");
    }
}
