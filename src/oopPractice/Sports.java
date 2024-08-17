package oopPractice;

public class Sports {

    private String name; // encupsulation DATA HIDING
    private String type;
    private boolean isOutdoorSport;
    private boolean isTeamSport;
    private int teamSize;

    private static boolean forHuman = true;

    public Sports(String name, String type, boolean isOutdoorSport, boolean isTeamSport, int teamSize) {
        this(name, type);
        setOutdoorSport(isOutdoorSport);
        setTeamSport(isTeamSport);
        setTeamSize(teamSize);
    }

    public Sports(String name, String type) {
        setName(name);
        setType(type);
    }

    public void play() {
        System.out.println("I'm playing " + name + forHuman);
    }

    public static void staticMethod() {
        System.out.println(forHuman);
    }

    public String getName() { // READ ONLY
        if (name == null) {
            name = "Unknown";
        }
        return name;
    }

    public void setName(String name) { // WRITE ONLY
        if (name.isBlank() || name.isEmpty()) {
//            throw new RuntimeException("Name shouldn't be empty or blank");
            System.err.println("Name shouldn't be empty or blank");
            System.exit(1);
        }
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isOutdoorSport() {
        return isOutdoorSport;
    }

    public void setOutdoorSport(boolean outdoorSport) {
        isOutdoorSport = outdoorSport;
    }

    public boolean isTeamSport() {
        return isTeamSport;
    }

    public void setTeamSport(boolean teamSport) {
        isTeamSport = teamSport;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        if (teamSize <= 0) {
            System.err.println("Team size must be positive number");
            System.exit(1);
        }
        this.teamSize = teamSize;
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", isOutdoorSport=" + isOutdoorSport +
                ", isTeamSport=" + isTeamSport +
                ", teamSize=" + teamSize +
                '}';
    }
}
