import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        Optional<String> full = Optional.of("full");
        full = full.filter(OptionalMethod::isPresent); // Optional.full

        Optional<String> multi = Optional.of("multi");
        multi = multi.filter(str -> str.equals("anObject"));
        System.out.println(multi); // Optional.empty
    }
}
