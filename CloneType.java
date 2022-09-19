public class CloneType {
    public int x;
    public int y;

    public CloneType(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[x=" + x + ", y=" + y + "]";
    }
}
