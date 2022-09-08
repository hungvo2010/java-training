public class ClassName {
    public static void main(String[] args) {
        System.out.println(Integer.class.getName()); // java.lang.Integer
        System.out.println(Integer.class.getSimpleName()); // Integer
        System.out.println(Integer.class.getCanonicalName()); // java.lang.Integer

        // 
        int[] arr = new int[]{};
        System.out.println(arr.getClass().getName()); // [I
        System.out.println(arr.getClass().getSimpleName()); // int[]
        System.out.println(arr.getClass().getCanonicalName()); // int[]
    }
}
