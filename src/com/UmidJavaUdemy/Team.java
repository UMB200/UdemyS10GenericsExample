package com.UmidJavaUdemy;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{
    private String tName;
    private int games, wins, failures, tie;

    private ArrayList<T> teamPlayers = new ArrayList<>();

    public Team(String tName) {
        this.tName = tName;
    }

    public String gettName() {
        return tName;
    }
    public boolean insertPlayer(T player){
        if(teamPlayers.contains(player)){
            System.out.println(player.getName() + " is already in the team");
            return false;
        } else {
            teamPlayers.add(player);
            System.out.println(player.getName() + " was added to the " + "team");
            return true;
        }
    }
    public int playersQty(){
        return teamPlayers.size();
    }
    public void defineResult(Team<T> opposite, int scoreOpposite, int scoreOur){
        String message;
        if(scoreOpposite > scoreOur){
            failures++;
            message = " lost ";
        } else if( scoreOpposite == scoreOur){
            tie++;
            message = " scored tie ";
        } else {
            wins++;
            message = " won ";
        }
        games++;
        if(opposite !=null){
            System.out.println(this.gettName() + message + opposite.gettName());
            opposite.defineResult(null, scoreOpposite, scoreOur); //save results in opponent's score
        }
    }
    public int teamRank(){
        return (wins * 2 + tie);
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.teamRank() > team.teamRank()){
            return -1; // team compared with others has higher ranking
        } else if(this.teamRank() < team.teamRank()){
            return 1; // team compared with others has lower ranking
        } else return 0; // draw or tie
    }
}
