package base;

import base.factorys.LeagueGrade;

import java.util.ArrayList;

public class BaseLeague {
    private LeagueGrade leagueGrade;
    private int points;
    private ArrayList<BasePlayer> players;

    public BaseLeague(LeagueGrade leagueGrade, int points, ArrayList<BasePlayer> players) {
        this.leagueGrade = leagueGrade;
        this.points = points;
        this.players = players;
    }

    public LeagueGrade getLeagueGrade() {
        return leagueGrade;
    }

    public int getPoints() {
        return points;
    }

    public ArrayList<BasePlayer> getPlayers() {
        return players;
    }
}
