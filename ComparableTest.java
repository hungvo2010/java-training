import java.util.Arrays;

import p1.Employee;

public class ComparableTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[4];
        staff[0] = new Employee("Harry Hacker", 35000);
        staff[1] = new Employee("Carl Cracker", 75000);
        staff[2] = new Employee("Tony Tester", 38000);
        staff[3] = new Manager("Tom Manager", 80000);

        

        // Arrays.sort() can only sort array of objects that its class implements
        // Comparable interface.
        Arrays.sort(staff);
        Arrays.toString(staff);
    }
}
