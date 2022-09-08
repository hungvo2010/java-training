public class ToString {
    public static void main(String[] args) {
        Employee e = new Manager("manager", 100);
        System.out.println(e);
        System.out.println(e.hashCode());
        // Note: Default behavior of toString() is to print class name, then @, then
        // unsigned hexadecimal representation of the hash code of the object.
    }
}
