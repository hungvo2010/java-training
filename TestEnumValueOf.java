public class TestEnumValueOf {
    public static void main(String[] args) {
        System.out.println(Enum.valueOf(Season.class, "WINTER"));
        System.out.println(Enum.valueOf(Season.class, "SUMMER"));
        System.out.println(Enum.valueOf(Season.class, "SPRING"));
        System.out.println(Enum.valueOf(Season.class, "FALL"));
    }
}
