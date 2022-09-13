public class Manager extends Employee {
    private int bonus;

    public Manager(String name, double salary) {
        super(name, salary);
        bonus = 100;
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return super.toString() + "[football=" + getFootball() + "]";
    }

    @Override
    public int compareTo(Employee other) {
        // The implementor must ensure sgn(x.compareTo(y)) = -sgn(y.compareTo(x)) for
        // all x and y .
        // if (this.getClass() != other.getClass())
        // throw new ClassCastException();
        // Manager otherManager = (Manager) other;
        // return otherManager.getFootball().compareTo(this.getFootball());
        return super.compareTo(other);
    }

}
