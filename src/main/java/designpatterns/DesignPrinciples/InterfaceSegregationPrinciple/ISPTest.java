package designpatterns.DesignPrinciples.InterfaceSegregationPrinciple;

import designpatterns.DesignPrinciples.InterfaceSegregationPrinciple.PlayerTypes.Player;
import designpatterns.DesignPrinciples.InterfaceSegregationPrinciple.Players.Player1;
import designpatterns.DesignPrinciples.InterfaceSegregationPrinciple.Players.Player2;

public class ISPTest {
    public static void start(){
        Player1 player1 = new Player1();
        player1.goAndBat();
        player1.goAndBowl();
        System.out.println("Player1 Name: " + player1.getPlayerName());

        Player2 player2 = new Player2();
        player2.goAndBowl();
        player2.goAndDoWicketKeeping();
        System.out.println("Player2 Team Name: " + player2.getTeamName());
    }
}
