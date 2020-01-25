package com.UmidJavaUdemy;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        ArrayList<Integer> myArray = new ArrayList<>();
//        myArray.add(1);
//        myArray.add(2);
//        myArray.add(3);
//        myArray.add(4);
//        myArray.add(5);
//        printOutOutcome(myArray);
       // creating football team
        FootballPlayer pete = new FootballPlayer("Pete");
        Team<FootballPlayer> usa = new Team<>("USA");
        usa.insertPlayer(pete);
        //creating baseball team
        BaseballPlayer tom = new BaseballPlayer("Tom");
        Team<BaseballPlayer> chicago = new Team<>("Yankees");
        chicago.insertPlayer(tom);
        //creating soccer team
        SoccerPlayer kaka = new SoccerPlayer("Kaka");
        SoccerPlayer ronaldo = new SoccerPlayer("Ronaldo");
        SoccerPlayer pele = new SoccerPlayer("Pele");
        Team<SoccerPlayer> brazil = new Team<>("Brazil");
        Team<SoccerPlayer> spain = new Team<>("Spain");
        Team<SoccerPlayer> canada = new Team<>("Canada");
        spain.insertPlayer(ronaldo);
        spain.insertPlayer(pele);
        brazil.insertPlayer(kaka);
        canada.insertPlayer(ronaldo);
        canada.insertPlayer(kaka);
        brazil.insertPlayer(pele);

        //game output
        brazil.defineResult(spain, 1, 0);
        //spain.defineResult(usa, 0, 5);
        //spain.defineResult(chicago, 10, 20);
        //usa.defineResult(brazil, 5, 10);
        canada.defineResult(brazil, 5, 6);
        brazil.defineResult(canada, 5, 10);
        canada.defineResult(spain, 5, 7);
        spain.defineResult(brazil, 3, 2);
        spain.defineResult(canada, 5, 6);


        //System.out.println(usa.gettName() + " team has " + usa.playersQty() + " players");
        System.out.println(canada.gettName() + "team rank is " + canada.teamRank());
        System.out.println(spain.gettName() + " team rank is " + spain.teamRank());
        System.out.println(brazil.gettName() + " team rank is " + brazil.teamRank());

        System.out.println(canada.compareTo(spain));
        System.out.println(canada.compareTo(brazil));
    }
    private static void printOutOutcome(ArrayList<Integer> items){
        for(int i : items){
            System.out.println(i * 2);
        }
    }
}
