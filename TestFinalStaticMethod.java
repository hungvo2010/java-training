public class TestFinalStaticMethod {
    public static void main(String[] args) {
        // 1
        // FinalStaticMethod.classMethod();
        // SubFinalStaticMethod.classMethod();

        // 2
        // FinalStaticMethod f = new SubFinalStaticMethod();
        // f.instanceMethod();

        // 3
        // FinalStaticMethod f = new FinalStaticMethod();
        // f.instanceMethod();

        // 4 Implementation in Sub hide the implementation in Super
        // FinalStaticMethod f = new FinalStaticMethod();
        // f.classMethod();
        // SubFinalStaticMethod s = new SubFinalStaticMethod();
        // s.classMethod();

        // 5
        // FinalStaticMethod f = new SubFinalStaticMethod();
        // f.classMethod();

        // 6: Add final to hide it.
        // let's say you are the developer of class A and you want to allow sub-classing.
        // But you really want method classMethod(), whenever called, even from a subclass,
        // that is does what you want it to do and not to be hidden by a subclass version.
        // Then you could make it final and prevent it from being hidden in the subclass.
        FinalStaticMethod f = new SubFinalStaticMethod();
        ((SubFinalStaticMethod)f).classMethod();
    }
}
