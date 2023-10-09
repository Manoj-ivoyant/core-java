public class MultipleCatchBlock {
    public static void main(String[] args) {
        // Initialize two Integer objects, 'a' as null and 'b' as 23.
        Integer a = null;
        Integer b = 23;

        try {
            // Attempt to add 'a' and 'b' (which might lead to exceptions).
            System.out.println(a + b);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception is thrown");
        } catch (NumberFormatException e) {
            System.out.println("Number format exception is thrown");
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception is thrown");
        } catch (Exception e) {
            System.out.println("Exception thrown!!!");
        }

        // This message is printed regardless of whether an exception occurred or not.
        System.out.println("Normal flow continues even if an exception occurred because of the try-catch block.");
    }
}
