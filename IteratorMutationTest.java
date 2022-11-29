import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IteratorMutationTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator it = list.iterator();
        it.next();
        it.remove();
        ListIterator listIterator = list.listIterator();
        System.out.println(it.toString());
        System.out.println(listIterator.toString());
        System.out.println(list.toString()); // [2, 3]: Human readable

        while(listIterator.hasNext()) {
            System.out.println("Next: " + listIterator.next());
            // System.out.println(listIterator.previous());
        }

        while(listIterator.hasPrevious()) {
            System.out.println("Previous: " + listIterator.previous());
        }

        while(listIterator.hasNext()) {
            System.out.println("Next: " + listIterator.next());
            // System.out.println(listIterator.previous());
        }        

        System.out.println(listIterator.previous());
        listIterator.remove();
        System.out.println(list.toString());
        // add() depend on iterator position, 
        // remove() depend on the iterator state.

        // java.util.LinkedList$ListItr@2a139a55
        // java.util.LinkedList$ListItr@15db9742
        // [2, 3]
        // Next: 2
        // Next: 3
        // Previous: 3
        // Previous: 2
    }
}
