public class OptionalMethod {
    public static boolean isPresent(String str){
        return str != null && str.length() >= 4;
    }
}
