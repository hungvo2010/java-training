public class CloneNotSupportTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Manager manager = new Manager("Tom", 1000);
        Manager newManager = (Manager) manager.clone();
        System.out.println(newManager);
    }
}
