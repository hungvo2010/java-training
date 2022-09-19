import java.util.Arrays;
import java.util.List;

public class PredicateListTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("sin", "company", "java", "python");
        boolean result = list.removeIf(str -> str == null);
        System.out.println(result);
    }
}
