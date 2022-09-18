import java.util.Arrays;

import p1.Employee;

public class ComparatorInterfaceTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("HarryHacker", 35000);
        staff[1] = new Employee("CarlHelloCracker", 75000);
        staff[2] = new Employee("Tony", 38000);

        Arrays.sort(staff, new ComparatorInterfaceStringBased());
        for (Employee e : staff) {
            System.out.println(e);
        }
    }
}
