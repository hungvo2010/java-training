import java.util.Arrays;

public class ArrayEquals {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3 };
        int[] b = new int[] { 1, 2, 3 };
        System.out.println(a == b); // compare memory address of a and b
        System.out.println(a.equals(b)); // compare memory address of a and b by default (derived from Object.equals())
        System.out.println(Arrays.equals(a, b));
    }
}
