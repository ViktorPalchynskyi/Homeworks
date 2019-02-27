package base.factorys;

import base.BasePlayer;

import java.util.ArrayList;

public class PlayerCreator {



    public static ArrayList <BasePlayer> createPalyer (LeagueGrade leagueGrade, int numberOfPlayers){
        ArrayList <BasePlayer> arrayList = new ArrayList<>();
        for (int i = 0; i < numberOfPlayers; i++) {
            arrayList.add(PlayerFactory.createPlayer(leagueGrade));
        }
        return arrayList;
    }

}
