import java.util.Arrays;

public class DeepString {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}};
        String deepStr = Arrays.deepToString(arr);

        int[][][] b = new int[][][]{
            {{1, 2, 3}, {4, 5, 6}},
            {{7, 8, 9}, {10, 11, 12}}
        };
        System.out.println(Arrays.toString(b));
    }
}
