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

        // Iterator it2 = list.iterator(2); // Error
        ListIterator it2 = list.listIterator(1); // return an Iterator that point the element at index - 1
        // ListIterator it2 = list.listIterator(-1); //
        // java.lang.IndexOutOfBoundsException
        ListIterator it3 = list.listIterator(3); // call it3.next() will throw java.util.NoSuchElementException
        System.out.println(it3.next());
        // listIterator.forEachRemaining(returnPredicate()); error, use Consumer instead
    }

    public static Consumer returnConsumer() {
        return t -> {
            if (t.equals(2)) {
                System.out.println("Found: 2");
            }
            System.out.println("Found: " + t);
        };
    }

    public static Predicate returnPredicate() {
        return t -> {
            return t.equals(2);
        };
    }
}
