package oopPractice;

public class Taekwando extends Sports {

    public Taekwando(String name, String type, boolean isOutdoorSport, boolean isTeamSport, int teamSize) {
        super(name, type, isOutdoorSport, isTeamSport, teamSize);
    }

    public Taekwando(String name, String type) {
        super(name, type);
    }
}
