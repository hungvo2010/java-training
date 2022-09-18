import p1.Employee;

public class JoinStringsTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Harry Hacker", 35000);
        employees[1] = new Employee("Carl Cracker", 75000);
        employees[2] = new Employee("Tony Tester", 38000);
        employees[3] = new Employee("Tony Tester", 38000);
        employees[4] = new Employee("Tony Tester", 38000);

        // String strJoin = String.join("###", employees); not work

    }
}
