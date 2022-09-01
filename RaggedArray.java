public class RaggedArray {
    public static void main(String[] args) {
        int row = 5;
        int[][] arr = new int[row][];
        for (int i = 1; i <= row; ++i){
            arr[i - 1] = new int[i];
        }        
        System.out.println(numElements(arr));
    }

    public static int numElements(int[][] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                count += 1;
            }
        }
        return count;
    }
}