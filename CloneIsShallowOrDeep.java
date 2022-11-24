import java.util.Arrays;

public class CloneIsShallowOrDeep {
    public static void main(String[] args) {
        CloneType[] a = new CloneType[] { new CloneType(1, 2), new CloneType(3, 4) };
        CloneType[] b = a.clone();

        b[0].x = 5;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        // Shallow copy: only copy the reference of the object
        // Deep copy: copy the object itself
        // Clone is shallow when the member of the object is object type
        // Clone is deep when the member of the object is primitive type

        byte[] c = new byte[]{1, 2, 3};
        byte[] d = c.clone();
        d[0] = 5;
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
    }
}
