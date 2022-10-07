public class CloneNotSupportTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Manager manager = new Manager("Tom", 1000);
        Manager newManager = (Manager) manager.clone();
        System.out.println(newManager);
        // CloneNotSupportedException is thrown to show that the clone method in class
        // Object has been called to clone an object, but that the object’s class does
        // not implement the Cloneable interface.
        // clone() method can be call by other method in same class, or by other class
        // in same package
    }
}
