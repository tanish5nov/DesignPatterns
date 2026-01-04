package designpatterns.DesignPrinciples.InterfaceSegregationPrinciple.Players;

import designpatterns.DesignPrinciples.InterfaceSegregationPrinciple.PlayerTypes.Batsman;
import designpatterns.DesignPrinciples.InterfaceSegregationPrinciple.PlayerTypes.Bowler;

public class Player1 implements Batsman, Bowler {
    @Override
    public String getTeamName(){
        return "INDIA";
    }

    @Override
    public String getPlayerName(){
        return "XYZ";
    }

    @Override
    public void goAndBat(){
        System.out.println("Player1 can bat");
    }

    @Override
    public void goAndBowl(){
        System.out.println("Player1 can Bowl");
    }
}
