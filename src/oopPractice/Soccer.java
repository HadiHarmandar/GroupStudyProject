package oopPractice;

public class Soccer extends Sports implements TeamSports { // Inheritance
    public Soccer(String name, String type, boolean isOutdoorSport, boolean isTeamSport, int teamSize) {
        super(name, type, isOutdoorSport, isTeamSport, teamSize); // super() is for calling super class constructers
    }

    public Soccer(String name, String type) {
        super(name, type);
    }

    public void subClassMethod() {
        System.out.println(getName());
    }

    @Override
    public void teamSports() {
        System.out.println(getName() + " is team sport");
    }
}
