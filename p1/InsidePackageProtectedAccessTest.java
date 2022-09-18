package p1;

public class InsidePackageProtectedAccessTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Tom", 1000);
        employee.printName();
    }
}
