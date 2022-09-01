public class TestString {
    public static void main(String[] args) {
        String origin = "hello world";
        // substring
        System.out.println(origin.substring(0, 5));
        // concatenation
        System.out.println(origin + "!!!");
        // String.join()
        System.out.println(String.join("H", "A"));
        // repeat start from Java 11
        // System.out.println(origin.repeat(3));
        // check equality
        System.out.println(origin.equals("hello world"));       
        // compare string lexiographically
        System.out.println(origin.compareTo("hello worlc"));
        System.out.println(origin.replace("hello", "cloud")); 
    }
}
