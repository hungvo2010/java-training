public class StaticClass {
    private int x = -1; 
    private int y = -2;
    // static {
    //     System.out.println("Inside static initialization blocks.");
    // }
    public StaticClass(){
        System.out.println("Inside no args constructor.");
        System.out.println(x);
        System.out.println(y);
        x = 10;
        y = 12;
    }
    private static int cl = staticMethod();
    private static int staticMethod() {
        System.out.println("Static Method");
        return -1;
    }
    public StaticClass(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
