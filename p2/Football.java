package p2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Football implements Comparable<Football> {
    private int score;
    private int time;
    private String team = init();
    private List<Employee> employees = new ArrayList<>();
    private final Date start;

    public Football(int score, int time, String team) {
        this.score = score;
        this.time = time;
        this.team = team;
        this.start = new Date();
    }

    public String init() {
        System.out.println("Football class init");
        return "Barcelona";
    }

    public Football() {
        this(0, 0, "unknown");

    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Date getStartDate() {
        return (Date) start.clone();
    }

    public static List<Football> createFootball() {
        System.out.println("Create a football");
        return Football.createEmptyList();
    }

    private static List<Football> createEmptyList() {
        return new ArrayList<>();
    }

    static {
        System.out.println("Football class loaded");
    }

    @Override
    public int compareTo(Football o) {
        return this.score - o.score;
    }
}