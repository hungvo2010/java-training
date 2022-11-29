import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class IteratorTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator it = list.iterator();
        ListIterator listIterator = list.listIterator();
        listIterator.forEachRemaining(returnConsumer());
        // listIterator.forEachRemaining(returnPredicate()); error
    }

    public static Consumer returnConsumer(){
        return t -> {
            if (t.equals(2)) {
                System.out.println("Found: 2");
            }
            System.out.println("Found: " + t);
        };
    } 

    public static Predicate returnPredicate(){
        return t -> {
            return t.equals(2);
        };
    }
}
