import java.util.Objects;

public class Employee implements Comparable<Employee> {

    private String name;
    private double salary;
    private Football football;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.football = Football.createFootball();
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Football getFootball() {
        return football;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }

    @Override
    public String toString() {
        // return getClass().getName() + "[name=" + name + ",salary=" + salary + "]";
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        // Check if two object are the same.
        if (this == obj) {
            return true;
        }
        // Check if the target object is null.
        if (obj == null) {
            return false;
        }
        // Check if the target object is the same class as this object.
        // Can not use instanceof here because it will return true if the target object
        // is a subclass of this object.
        // If a.equals(b) is true, then b.equals(a) must be true.
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Employee other = (Employee) obj;
        // Use == to compare primitive type, Object.equals() to compare object.
        return Objects.equals(this.name, other.name) && this.salary == other.salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, football);
    }
}