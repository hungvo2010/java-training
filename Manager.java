public class Manager extends Employee {

    public Manager(String name, double salary) {
        super(name, salary);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return super.toString() + "[football=" + getFootball() + "]";
    }

}
