public class TestDefaultMethodInterface {
    public static void main(String[] args) {
        DefaultMethodInterface d = new ImplementDefaultMethodInterface();
        DefaultMethodInterface.printString();
        System.out.println(d.getValue());
    }
}
