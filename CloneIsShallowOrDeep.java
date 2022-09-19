import java.util.Arrays;

public class CloneIsShallowOrDeep {
    public static void main(String[] args) {
        CloneType[] a = new CloneType[] { new CloneType(1, 2), new CloneType(3, 4) };
        CloneType[] b = a.clone();

        b[0].x = 5;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
