package testcode;
public class Overflow {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println(Math.multiplyExact(1000000*1000000000, 3));
    }
}