public class Child extends Father {
    @Override
    public void doA() {
        System.out.println("Child doA");
        doB();
    }

}
