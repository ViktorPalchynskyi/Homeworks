package base.factorys;

import base.BaseLeague;

public class LeagueFactory {




    public static BaseLeague createLeague (LeagueGrade leagueGrade, int numberOfPlayers){
        switch (leagueGrade){

            case SECOND_LEAGUE:
               return new BaseLeague(LeagueGrade.SECOND_LEAGUE, 5,PlayerCreator.createPlayer(LeagueGrade.SECOND_LEAGUE,10));
            case FERST_LEAGUE:
                return new BaseLeague(LeagueGrade.FERST_LEAGUE, 10,PlayerCreator.createPlayer(LeagueGrade.FERST_LEAGUE,10));
            case PREMIUM_LEAGUE:
                return new BaseLeague(LeagueGrade.PREMIUM_LEAGUE, 20,PlayerCreator.createPlayer(LeagueGrade.PREMIUM_LEAGUE,10));

        }
        return null;
    }

}
