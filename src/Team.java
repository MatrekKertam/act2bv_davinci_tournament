import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players;
    private int goalCounter;

    Team () {
        this.setPlayers(new ArrayList<>());
        this.setGoalCounter(0);
    }

    Team (String name) {
        this.setPlayers(new ArrayList<>());
        this.setGoalCounter(0);
        this.setName(name);
    }

    //setter name
    public void setName (String name){
        this.name = name;
        return;
    }

    //getter name
    public String getName (){
        return name;
    }

    //getter players
    public ArrayList<Player> getPlayers(){
        return players;
    }

    //setter players
    public void setPlayers (ArrayList<Player> players){
        this.players = players;
    }

    //addPlayer:: (Player) -> void
    public void addPlayer (Player player) {
        this.players.add(player);
        player.setTeam(this);
    }

    public void removePlayer (Player player){
        return;
    }

    //getter goalCounter:: void -> int
    public int getGoalCounter() {
        return goalCounter;
    }

    public void setGoalCounter(int goalCounter) {
        this.goalCounter = goalCounter;
    }

    //incrementGoalCounter:: (void) -> void
    public void incrementGoalCounter() {
        //this.goalCounter = this.goalCounter + 1; //autoasignación
        this.goalCounter++;
    }
}
