public class FinalStaticMethodTest {
    public static void main(String[] args) {
        FinalStaticMethodClass sup = new SubFinalStaticMethodClass();
        ((SubFinalStaticMethodClass)sup).doSomething(); // do something in subclass
    }
}
