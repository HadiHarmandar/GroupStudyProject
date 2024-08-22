package oopPractice;

public class Basketball extends Sports implements TeamSports {
    public Basketball(String name, String type, boolean isOutdoorSport, boolean isTeamSport, int teamSize) {
        super(name, type, isOutdoorSport, isTeamSport, teamSize);
    }

    public Basketball(String name, String type) {
        super(name, type);
    }

    @Override
    public void teamSports() {
        System.out.println(getType() + " is team sports");
    }
}
