package com.volleycn.lineup.model;

import androidx.annotation.NonNull;

import java.util.List;

public class MatchLineUpInfo implements Cloneable {
    public List<MatchLineUpMember> home;
    public List<MatchLineUpMember> away;
    public String awayFormation;
    public String awayTeamId;
    public String awayTeamLogo;
    public String awayTeamName;
    public String confirmed;
    public String homeFormation;
    public String homeTeamId;
    public String homeTeamLogo;
    public String homeTeamName;
    public String id;
    public boolean homeTeam;

    @NonNull
    @Override
    public MatchLineUpInfo clone() throws CloneNotSupportedException {
        return (MatchLineUpInfo) super.clone();
    }
}
