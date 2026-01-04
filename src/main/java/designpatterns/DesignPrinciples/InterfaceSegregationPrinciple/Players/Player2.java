package designpatterns.DesignPrinciples.InterfaceSegregationPrinciple.Players;

import designpatterns.DesignPrinciples.InterfaceSegregationPrinciple.PlayerTypes.Bowler;
import designpatterns.DesignPrinciples.InterfaceSegregationPrinciple.PlayerTypes.WicketKeeper;

public class Player2 implements WicketKeeper, Bowler {
    @Override
    public String getTeamName(){
        return "INDIA";
    }

    @Override
    public String getPlayerName(){
        return "XYZ";
    }

    @Override
    public void goAndDoWicketKeeping(){
        System.out.println("Player2 can Do WicketKeeping");
    }

    @Override
    public void goAndBowl(){
        System.out.println("Player2 can Bowl");
    }
}
