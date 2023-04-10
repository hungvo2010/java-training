public interface Person {
    public final String name = "Person";

    default String getName() {
        return "";
    }

}
