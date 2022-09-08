
public enum Season {
    WINTER(10), SUMMER(4), SPRING(1), FALL(7);

    private int startMonth;

    private Season(int startMonth) {
        this.startMonth = startMonth;
    }

    public int getStartMonth() {
        return startMonth;
    }
}
