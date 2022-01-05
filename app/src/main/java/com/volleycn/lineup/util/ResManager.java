package com.volleycn.lineup.util;

import com.blankj.utilcode.util.StringUtils;
import com.volleycn.lineup.R;

public class ResManager {
    /**
     * 1 进球
     * 2 角球
     * 3 黄牌
     * 4 红牌
     * 5 界外球
     * 6 任意球
     * 7 球门球
     * 8 点球
     * 9 换人
     * 10 比赛开始
     * 11 中场
     * 12 结束
     * 13 半场比分
     * 15 两黄变红
     * 16 点球未进
     * 17 乌龙球
     * 19 伤停补时
     * 21 射正
     * 22 射偏
     * 23 进攻
     * 24 危险进攻
     * 25 控球率
     * 26 加时赛结束
     * 27 点球大战结束
     * 28 VAR(视频助理裁判)
     * 29 点球(点球大战)(type_v2字段返回)
     * 30 点球未进(点球大战)(type_v2字段返回)
     * 40 换上
     * 41 换下
     *
     * @param type
     * @return
     */
    public MatchEvent getMatchEvent(int type) {
        switch (type) {
            case 1:
                return new MatchEvent(StringUtils.getString(R.string.match_event_enter_ball),
                        R.drawable.match_event_enter_ball, type);
            case 2:
                return new MatchEvent(StringUtils.getString(R.string.match_event_corner_kick),
                        R.drawable.match_event_corner_kick, type);
            case 3:
                return new MatchEvent(StringUtils.getString(R.string.match_event_yellow_card),
                        R.drawable.match_event_yellow_card, type);
            case 4:
                return new MatchEvent(StringUtils.getString(R.string.match_event_red_card),
                        R.drawable.match_event_red_card, type);
            case 8:
                return new MatchEvent(StringUtils.getString(R.string.match_event_kick),
                        R.drawable.match_event_kick, type);
            case 29:
                return new MatchEvent(StringUtils.getString(R.string.match_event_kick_penalty_shootout),
                        R.drawable.match_event_kick, type);
            case 9:
                return new MatchEvent(StringUtils.getString(R.string.match_event_replace),
                        R.drawable.match_event_replace, type);
            case 10:
                return new MatchEvent(StringUtils.getString(R.string.match_event_start),
                        R.drawable.match_event_start, type);
            case 11:
                return new MatchEvent(StringUtils.getString(R.string.match_event_center),
                        R.drawable.match_event_center, type);
            case 12:
                return new MatchEvent(StringUtils.getString(R.string.match_event_end),
                        R.drawable.match_event_end, type);
            case 15:
                return new MatchEvent(StringUtils.getString(R.string.match_event_double_yellow_to_red_card),
                        R.drawable.match_event_double_yellow_to_red_card, type);
            case 16:
                return new MatchEvent(StringUtils.getString(R.string.match_event_kick_no_enter),
                        R.drawable.match_event_kick_no_enter, type);
            case 30:
                return new MatchEvent(StringUtils.getString(R.string.match_event_kick_no_enter_penalty_shootout),
                        R.drawable.match_event_kick_no_enter, type);
            case 17:
                return new MatchEvent(StringUtils.getString(R.string.match_event_own_goal),
                        R.drawable.match_event_own_goal, type);
            case 40:
                return new MatchEvent(StringUtils.getString(R.string.match_event_replace_up),
                        R.drawable.match_event_replace_up, type);
            case 41:
                return new MatchEvent(StringUtils.getString(R.string.match_event_replace_down),
                        R.drawable.match_event_replace_down, type);
            case 5:
                return new MatchEvent(StringUtils.getString(R.string.match_event_out_of_bounds),
                        R.drawable.match_event_narrator, type);
            case 6:
                return new MatchEvent(StringUtils.getString(R.string.match_event_free_kick),
                        R.drawable.match_event_narrator, type);
            case 7:
                return new MatchEvent(StringUtils.getString(R.string.match_event_goal_ball),
                        R.drawable.match_event_narrator, type);
            case 13:
                return new MatchEvent(StringUtils.getString(R.string.match_event_halftime_score),
                        R.drawable.match_event_narrator, type);
            case 19:
                return new MatchEvent(StringUtils.getString(R.string.match_event_injury_stop_time),
                        R.drawable.match_event_narrator, type);
            case 21:
                return new MatchEvent(StringUtils.getString(R.string.match_event_shoot_right),
                        R.drawable.match_event_narrator, type);
            case 22:
                return new MatchEvent(StringUtils.getString(R.string.match_event_deflection),
                        R.drawable.match_event_narrator, type);
            case 23:
                return new MatchEvent(StringUtils.getString(R.string.match_event_attack),
                        R.drawable.match_event_narrator, type);
            case 24:
                return new MatchEvent(StringUtils.getString(R.string.match_event_dangerous_attack),
                        R.drawable.match_event_narrator, type);
            case 25:
                return new MatchEvent(StringUtils.getString(R.string.match_event_ball_control_rate),
                        R.drawable.match_event_narrator, type);
            case 26:
                return new MatchEvent(StringUtils.getString(R.string.match_event_extra_time_over),
                        R.drawable.match_event_narrator, type);
            case 27:
                return new MatchEvent(StringUtils.getString(R.string.match_event_penalty_fight_over),
                        R.drawable.match_event_narrator, type);
            case 28:
                return new MatchEvent(StringUtils.getString(R.string.match_event_var),
                        R.drawable.match_event_narrator, type);
            default:
                return new MatchEvent(StringUtils.getString(R.string.match_event_narrator),
                        R.drawable.match_event_narrator, type);
        }
    }

    public String getWeekDayStr(int matchWeekDay) {
        switch (matchWeekDay) {
            case 1:
                return "周一";
            case 2:
                return "周二";
            case 3:
                return "周三";
            case 4:
                return "周四";
            case 5:
                return "周五";
            case 6:
                return "周六";
            case 7:
                return "周日";
            default:
                break;

        }
        return "--";
    }

    public static class MatchEvent {
        private String eventDes;
        private int eventIconRes;
        private int type;

        public MatchEvent(String eventDes, int eventIconRes, int type) {
            this.eventDes = eventDes;
            this.eventIconRes = eventIconRes;
            this.type = type;
        }

        public String getEventDes() {
            return eventDes;
        }

        public void setEventDes(String eventDes) {
            this.eventDes = eventDes;
        }

        public int getEventIconRes() {
            return eventIconRes;
        }

        public void setEventIconRes(int eventIconRes) {
            this.eventIconRes = eventIconRes;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }
    }
}
