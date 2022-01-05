package com.volleycn.lineup.model;


import com.volleycn.lineup.util.ResManager;
import com.volleycn.lineupview.LineUpData;

import java.util.List;

public class MatchLineUpMember extends LineUpData {
    public String first;
    public String id;
    public String logo;
    public String name;
    public String position;
    public String positionName;
    public String rating;
    public String shirtNumber;
    public String teamId;
    public List<MemberEvent> incidents;

    public static class MemberEvent {
        public String addtime;
        public String belong;
        public String minute;
        public String time;
        public int type;
        private ResManager.MatchEvent matchEvent;


        public ResManager.MatchEvent getMatchEvent() {
            if (matchEvent == null) {
                matchEvent = new ResManager().getMatchEvent(type);
            }
            return matchEvent;
        }
    }
}
