public interface DefaultMethodInterface {
    default int getValue() {
        return 0;
    }

    static void printString() {
        System.out.println("DefaultMethodInterface");
    }
}
