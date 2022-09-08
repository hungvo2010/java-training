public class FactoryMethodAndOverrideWithSubClass {
    public static void main(String[] args) {
        // Benefit of factory method over constructor:
        // 1. Can return subclass of the class
        // 2. Can give name to the method, add one more layer of documentation.
        Football.createFootball();
    }
}