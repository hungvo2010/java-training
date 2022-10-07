import java.util.function.BiFunction;

public class BiFunctionTest {
    public static void main(String[] args) {
        BiFunction<String, String, Integer> compareBaseOnLength = (first, second) -> {
            return first.length() - second.length();
        };
        System.out.println(compareBaseOnLength.apply("sin", "company"));
    }
}
