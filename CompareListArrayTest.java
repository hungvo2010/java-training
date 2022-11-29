import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CompareListArrayTest {
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            arrList.add(i);
        }
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }
        Long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrList.get(i);
        }
        Long end = System.currentTimeMillis();
        System.out.println("ArrayList get time: " + (end - start)); // 3ms
        start = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            linkedList.get(i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList get time: " + (end - start)); // 3354ms
    }
}
