package base.factorys;

import base.BasePlayer;
import base.random.RandomName;
import base.random.RandomVariable;

public class PlayerFactory {



    static BasePlayer createPlayer (LeagueGrade leagueGrade){
        switch (leagueGrade){
            case SECOND_LEAGUE:
                return new BasePlayer(RandomName.getRandomName(), RandomVariable.randomStats(18,40), RandomVariable.randomStats(5,15));
            case FERST_LEAGUE:
                return new BasePlayer(RandomName.getRandomName(), RandomVariable.randomStats(18,40), RandomVariable.randomStats(10,25));
            case PREMIUM_LEAGUE:
                return new BasePlayer(RandomName.getRandomName(), RandomVariable.randomStats(18,40), RandomVariable.randomStats(20,40));
        }
        return null;
    }
}
