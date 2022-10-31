public class Player {
    private String name;
    private Team team;
    private String position;
    private int goalCounter;

    Player(String name) {
        this.setName(name);
        this.setGoalCounter(0);
    }

    // void -> String
    public String getName() {
        return name;
    }

    //(String) -> void
    public void setName (String name) {
        this.name = name;
    }

    // (void) -> String
    public String getPosition(){
        return position;
    }

    // setter setPosition (String) -> void
    public void setPosition(String position){
        this.position = position;
    }

    // getter getGoalCounter (void) -> int
    public int getGoalCounter(){
        return goalCounter;
    }

    // setter setGoalCounter private
    private void setGoalCounter(int goalCounter){
        this.goalCounter = goalCounter;
    }

    public void makeGoal() {
        return;
    }

    //getter team
    public Team getTeam() {
        return team;
    }
    //setter team
    public void setTeam (Team team) {
        this.team = team;
    }
}
