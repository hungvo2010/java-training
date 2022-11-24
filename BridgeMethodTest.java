public class BridgeMethodTest {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        MyNode mn = new MyNode(5);
        Node n = mn; // A raw type - compiler throws an unchecked warning
        n.setData(12); // Causes a ClassCastException to be thrown.
        Integer x = mn.data;
    }
}
