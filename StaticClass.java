public class StaticClass {
    private static String message = "Hello, world!";
    private String nonStaticMessage = "Nonstatic Hello, world!";
    public static class InnerStaticClass {
        // ...
        void printMessage() {
            System.out.println(message);
        }
    }
    public class InnerClass {
        // ...
        void printMessage() {
            System.out.println(nonStaticMessage);
        }
    }
    public static void main(String[] args) {
        StaticClass.InnerStaticClass innerStaticClass = new StaticClass.InnerStaticClass();
        StaticClass outer = new StaticClass();
        StaticClass.InnerClass innerClass = outer.new InnerClass();
        innerStaticClass.printMessage();
        innerClass.printMessage();
    }
}
