public class LabelLoopTest {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 40; ++i){
            inner:
            for (int j = 0; j < i; ++j){
                if (j == 30){
                    System.out.println("Hello World");
                    break outer;
                }
            }
        }

        String a = "12";

        hello:
        if (a.equals("12")){
            world:
            if (a.trim().equals(a)){
                break hello;
            }
        }
    }
}