/**
 * This class demonstrates exception propagation in Java.
 * It shows how an exception thrown in method A propagates up the call stack
 * through methods B and C, and is eventually caught in the catch block in method C.
 */
class TestExceptionPropagation {
    public static void main(String args[]) {
        TestExceptionPropagation test = new TestExceptionPropagation();
        test.C();
        System.out.println("Rest of the code works fine...");
    }

    void A() {
        int i = 45 / 0; // ArithmeticException will be thrown here
    }

    void B() {
        A();
    }

    void C() {
        try {
            B();
        } catch (Exception e) {
            System.out.println(e); // The caught exception is printed here
        }
    }
}
