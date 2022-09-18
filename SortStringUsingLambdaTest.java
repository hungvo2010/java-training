import java.util.Arrays;

public class SortStringUsingLambdaTest {
    public static void main(String[] args) {
        String[] names = { "Tommmmmmmm", "Dick", "Harryssss" };
        Arrays.sort(names, (a, b) -> a.length() - b.length());
        System.out.println(Arrays.toString(names));
    }
}
