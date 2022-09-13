public class TestHashcode {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        int[] a = new int[] { 1, 2 };
        System.out.println(a); // default toString() method: ClassName@HashCode (in hexadecimal)
        System.out.println(a.hashCode());
        // System.out.println(s2.hashCode());
    }
}
