public class FinallyExecutionTest {
    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
        } catch (Exception e) {
            // TODO: handle exception
            System.exit(-1);
            throw new ArithmeticException();
        }
        finally {
            System.out.println("STDOUT in finally block.");
        }
    }
}