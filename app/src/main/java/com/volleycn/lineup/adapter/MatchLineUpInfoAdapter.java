package com.volleycn.lineup.adapter;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.blankj.utilcode.util.AdaptScreenUtils;
import com.blankj.utilcode.util.ColorUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.volleycn.lineup.R;
import com.volleycn.lineup.model.MatchLineUpMember;
import com.volleycn.lineup.util.ResManager;
import com.volleycn.lineupview.LineUpAdapter;

import java.util.List;


public class MatchLineUpInfoAdapter extends LineUpAdapter<MatchLineUpMember> {

    public MatchLineUpInfoAdapter(Context context) {
        super(context, R.layout.item_line_up_member, R.layout.item_line_up_member_event);
    }

    @Override
    public View onInitMemberView(View memberView, MatchLineUpMember member) {
        try {
            ImageView lineup_member_jersey = memberView.findViewById(R.id.lineup_member_jersey);
            lineup_member_jersey.setImageResource(member.homeTeam ? R.drawable.match_lineup_home_team_jersey : R.drawable.match_lineup_away_team_jersey);
            TextView lineup_member_name = memberView.findViewById(R.id.lineup_member_name);
            lineup_member_name.setText(member.name + "");
            TextView lineup_member_number = memberView.findViewById(R.id.lineup_member_number);
            lineup_member_number.setText(member.shirtNumber + "");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return memberView;
    }

    @Override
    public View onInitMemberEventView(View memberEventView, MatchLineUpMember member) {
        try {
            List<MatchLineUpMember.MemberEvent> incidents = member.incidents;
            if (incidents != null) {
                LinearLayout eventContent = memberEventView.findViewById(R.id.lineup_member_event_content);
                eventContent.removeAllViews();
                for (int i = 0; i < incidents.size(); i++) {
                    MatchLineUpMember.MemberEvent memberEvent = incidents.get(i);
                    ResManager.MatchEvent matchEvent = memberEvent.getMatchEvent();
                    if (matchEvent.getEventIconRes() != R.drawable.match_event_narrator) {
                        ImageView imageView = new ImageView(context);
                        int h = SizeUtils.dp2px(16);
                        boolean replace = memberEvent.type == 40 || 41 == memberEvent.type;
                        int w = SizeUtils.dp2px(replace ? 13 : 16);
                        imageView.setImageResource(matchEvent.getEventIconRes());
                        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(w, h);
                        eventContent.addView(imageView, params);
                        if (replace) {
                            TextView textView = new TextView(context);
                            textView.setText(memberEvent.minute + "'");
                            textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, SizeUtils.sp2px(10));
                            textView.setTextColor(ColorUtils.getColor(R.color.color_292B33));
                            int margin = SizeUtils.dp2px(2);
                            LinearLayout.LayoutParams textParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                            textParams.rightMargin = margin;
                            textParams.leftMargin = margin;
                            eventContent.addView(textView, textParams);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return memberEventView;
    }
}