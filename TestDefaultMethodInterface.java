public class TestDefaultMethodInterface {
    public static void main(String[] args) {
        // Static, default method using.
        // DefaultMethodInterface d = new ImplementDefaultMethodInterface();
        DefaultMethodInterface.printString();
        // System.out.println(d.getValue());

        // Using 3rd interface with default method
        Employee e = new Employee("John", 10000);
        e.remove();
    }
}
