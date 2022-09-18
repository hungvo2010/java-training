import java.util.Comparator;

import p1.Employee;

public class ComparatorInterfaceStringBased implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.getName().length(), e2.getName().length());
    }

}
