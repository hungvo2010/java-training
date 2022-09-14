import java.util.ArrayList;
import java.util.List;

public class WaterFootball extends Football {
    public WaterFootball(int score, int time, String team) {
        super(score, time, team);
    }

    public WaterFootball() {
        super();
    }

    public static List<Football> createFootball() {
        Football.createFootball();
        System.out.println("Create a water football");
        return new ArrayList<>();
    }

    static {
        System.out.println("WaterFootball class loaded");
    }
}
