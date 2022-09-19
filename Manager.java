import p1.Employee;

public class Manager extends Employee implements Cloneable {
    private int bonus;
    private NotClone notClone;

    public Manager(String name, double salary) {
        super(name, salary);
        bonus = 100;
        notClone = new NotClone();
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

    @Override
    public Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        Manager cloned = (Manager) super.clone();
        assert cloned == null : "cloned is null";
        // cloned.notClone is in same package with Manager, so its method clone() can be accessed
        // cloned.notClone.clone() is a protected method
        // CloneNotSupportedException is thrown because Object.clone() is called but the class not implements Cloneable
        cloned.notClone = (NotClone) notClone.clone();
        return cloned;
    }
}
