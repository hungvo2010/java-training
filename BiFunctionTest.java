import java.util.function.BiFunction;

public class BiFunctionTest {
    public static void main(String[] args) {
        BiFunction<String, String, Integer> compareBaseOnLength = (String first, String second) -> {
            return first.length() - second.length();
        };
        System.out.println(compareBaseOnLength.apply("sin", "company"));
    }
}
