import java.util.Date;

public class Match {
    private Date date;
    private String location;
    private Team localTeam;
    private Team visitantTeam;
    private int localTeamScore;
    private int visitantTeamScore;

    Match() {
        this.localTeamScore = 0;
        this.visitantTeamScore = 0;
    }

    Match(String location) {
        this.localTeamScore = 0;
        this.visitantTeamScore = 0;
        this.setLocation(location);
    }

    Match(String location, Date date) {
        this.localTeamScore = 0;
        this.visitantTeamScore = 0;
        this.setLocation(location);
        this.setDate(date);
    }

    Match(String location, Date date, Team localTeam, Team visitantTeam) {
        this.localTeamScore = 0;
        this.visitantTeamScore = 0;
        this.setLocation(location);
        this.setDate(date);
        this.setLocalTeam(localTeam);
        this.setVisitantTeam(visitantTeam);
    }


    // setter location
    public void setLocation(String location) {
        this.location = location;
    }


    //getter date
    public Date getDate(){
        return date;
    }

    //setter setDate::  (Date) -> void
    public void setDate(Date date){
        this.date = date;
    }

  /*public Date setDateAndGet(Date date) {
    this.setDate(date);
    return this.getDate();
  }*/

    //getter localTeam
    public Team getLocalTeam(){
        return localTeam;
    }

    //setter localTeam
    public void setLocalTeam(Team localTeam){
        this.localTeam = localTeam;
    }

    // getter visitantTeam
    public Team getVisitantTeam(){
        return visitantTeam;
    }

    //setter visitantTeam
    public void setVisitantTeam(Team visitantTeam){
        this.visitantTeam = visitantTeam;
    }

    // get visitantTeamScore
    public int getVisitantTeamScore(){
        return visitantTeamScore;
    }

    // get localTeamScore
    public int getLocalTeamScore(){
        return localTeamScore;
    }

    //incrementVisitantTeamScore:: void -> void
    public void incrementVisitantTeamScore(){
        this.visitantTeamScore = this.visitantTeamScore + 1;
        return;
    }

    //incrementLocalTeamScore:: void -> void
    public void incrementLocalTeamScore(){
        this.localTeamScore ++;
        return;
    }
}