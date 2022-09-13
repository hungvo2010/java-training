public class ImplementDefaultMethodInterface implements DefaultMethodInterface {

    @Override
    public void printString() {
        // TODO Auto-generated method stub
        System.out.println("ImplementDefaultMethodInterface");
    }

    @Override
    public int getValue() {
        // override the default method in interface
        return 10;
    }

}
