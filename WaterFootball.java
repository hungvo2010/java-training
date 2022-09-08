public class WaterFootball extends Football {
    public WaterFootball(int score, int time, String team) {
        super(score, time, team);
    }

    public WaterFootball() {
        super();
    }

    public static WaterFootball createFootball() {
        Football.createFootball();
        System.out.println("Create a water football");
        return new WaterFootball();
    }

    static {
        System.out.println("WaterFootball class loaded");
    }
}
