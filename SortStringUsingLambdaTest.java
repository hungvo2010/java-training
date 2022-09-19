import java.util.Arrays;

public class SortStringUsingLambdaTest {
    public static void main(String[] args) {
        String[] names = { "Tommmmmmmm", "Uick", "Harryssss" };
        // Arrays.sort(names, (a, b) -> a.length() - b.length());
        // Arrays.sort(names, (String a, String b) -> a.length() - b.length());
        // Arrays.sort(names, (String a, String b) -> {
        // return a.length() - b.length();
        // });
        Arrays.sort(names, String::compareTo);
        System.out.println(Arrays.toString(names));
    }
}
