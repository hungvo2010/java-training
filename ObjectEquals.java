import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ObjectEquals {
    public static void main(String[] args) {
        Map<Integer, Employee> map = new HashMap<>();
        map.put(1, new Employee("hello", 2));
        Employee a = map.get(1);
        Employee b = map.get(2);
        System.out.println(Objects.equals(a, b));

        // Objects.equals(a, b)
        // a == b == null => true
        // a or b == null => false
        // a.equals(b)
    }
}