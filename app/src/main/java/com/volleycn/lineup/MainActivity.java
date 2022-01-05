package com.volleycn.lineup;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.fastjson.JSON;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;
import com.volleycn.lineup.adapter.MatchLineUpInfoAdapter;
import com.volleycn.lineup.model.MatchLineUpMember;
import com.volleycn.lineupview.LineUpView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView match_home_team_name = findViewById(R.id.match_home_team_name);
        match_home_team_name.setText("曼联");
        TextView match_home_lineup_name = findViewById(R.id.match_home_lineup_name);
        match_home_lineup_name.setText("4-2-2-2");

        TextView match_away_team_name = findViewById(R.id.match_away_team_name);
        match_away_team_name.setText("狼队");

        TextView match_away_lineup_name = findViewById(R.id.match_away_lineup_name);
        match_away_lineup_name.setText("3-4-3");

        LineUpView match_home_lineup = findViewById(R.id.match_home_lineup);
        LineUpView match_away_lineup = findViewById(R.id.match_away_lineup);
        MatchLineUpInfoAdapter homeAdapter;
        MatchLineUpInfoAdapter awayAdapter;
        match_home_lineup.setAdapter(homeAdapter = new MatchLineUpInfoAdapter(this));
        match_away_lineup.setAdapter(awayAdapter = new MatchLineUpInfoAdapter(this));

        List<MatchLineUpMember> homeMembers = JSON.parseArray(homeJson, MatchLineUpMember.class);
        List<MatchLineUpMember> awayMembers = JSON.parseArray(awayJson, MatchLineUpMember.class);
        homeAdapter.setList(homeMembers);
        awayAdapter.setList(awayMembers);
    }

    private String homeJson = "[{\"baseHeight\":0,\"event\":false,\"first\":\"1\",\"hasEvent\":false,\"homeTeam\":true,\"id\":\"25003\",\"logo\":\"http://cdn.sportnanoapi.com/football/player/82acd69c4d7831bc351ade893e93c3ec.png\",\"name\":\"德赫亚\",\"position\":\"G\",\"positionName\":\"守门员\",\"rating\":\"7.44\",\"shirtNumber\":\"1\",\"teamId\":\"10135\",\"x\":50,\"y\":12},{\"baseHeight\":0,\"event\":false,\"first\":\"1\",\"hasEvent\":true,\"homeTeam\":true,\"id\":\"105269\",\"incidents\":[{\"addtime\":\"0\",\"belong\":\"1\",\"matchEvent\":{\"eventDes\":\"换下\",\"eventIconRes\":2131231159,\"type\":41},\"minute\":\"83\",\"time\":\"84\",\"type\":41}],\"logo\":\"http://cdn.sportnanoapi.com/football/player/d625850b8b87fd0da8cb9122e143523f.png\",\"name\":\"万-比萨卡\",\"position\":\"D\",\"positionName\":\"后卫\",\"rating\":\"6.33\",\"shirtNumber\":\"29\",\"teamId\":\"10135\",\"x\":13,\"y\":32},{\"baseHeight\":0,\"event\":false,\"first\":\"1\",\"hasEvent\":false,\"homeTeam\":true,\"id\":\"27736\",\"logo\":\"http://cdn.sportnanoapi.com/football/player/2e13b2cb1a0c5773fd09135d77990c79.png\",\"name\":\"琼斯\",\"position\":\"D\",\"positionName\":\"后卫\",\"rating\":\"7.36\",\"shirtNumber\":\"4\",\"teamId\":\"10135\",\"x\":36,\"y\":32},{\"baseHeight\":0,\"event\":false,\"first\":\"1\",\"hasEvent\":false,\"homeTeam\":true,\"id\":\"34009\",\"logo\":\"http://cdn.sportnanoapi.com/football/player/c5f9b0564c1aadd1f453b1177e28eddb.png\",\"name\":\"瓦拉内\",\"position\":\"D\",\"positionName\":\"后卫\",\"rating\":\"6.6\",\"shirtNumber\":\"19\",\"teamId\":\"10135\",\"x\":64,\"y\":32},{\"baseHeight\":0,\"event\":false,\"first\":\"1\",\"hasEvent\":true,\"homeTeam\":true,\"id\":\"40493\",\"incidents\":[{\"addtime\":\"0\",\"belong\":\"1\",\"matchEvent\":{\"eventDes\":\"黄牌\",\"eventIconRes\":2131231164,\"type\":3},\"minute\":\"55\",\"time\":\"56\",\"type\":3}],\"logo\":\"http://cdn.sportnanoapi.com/football/player/c1dfcb568f93136a0f44c302b437602d.png\",\"name\":\"肖\",\"position\":\"D\",\"positionName\":\"后卫\",\"rating\":\"6.2\",\"shirtNumber\":\"23\",\"teamId\":\"10135\",\"x\":87,\"y\":32},{\"baseHeight\":0,\"event\":false,\"first\":\"1\",\"hasEvent\":true,\"homeTeam\":true,\"id\":\"94807\",\"incidents\":[{\"addtime\":\"0\",\"belong\":\"1\",\"matchEvent\":{\"eventDes\":\"黄牌\",\"eventIconRes\":2131231164,\"type\":3},\"minute\":\"47\",\"time\":\"48\",\"type\":3}],\"logo\":\"http://cdn.sportnanoapi.com/football/player/e46958248815c07ee0fe263635ce568a.png\",\"name\":\"麦克托米奈\",\"position\":\"M\",\"positionName\":\"中场\",\"rating\":\"7.33\",\"shirtNumber\":\"39\",\"teamId\":\"10135\",\"x\":36,\"y\":52},{\"baseHeight\":0,\"event\":false,\"first\":\"1\",\"hasEvent\":true,\"homeTeam\":true,\"id\":\"19772\",\"incidents\":[{\"addtime\":\"0\",\"belong\":\"1\",\"matchEvent\":{\"eventDes\":\"黄牌\",\"eventIconRes\":2131231164,\"type\":3},\"minute\":\"73\",\"time\":\"74\",\"type\":3}],\"logo\":\"http://cdn.sportnanoapi.com/football/player/7971f7f780b84f9b3ba905408305753f.png\",\"name\":\"马蒂奇\",\"position\":\"M\",\"positionName\":\"中场\",\"rating\":\"7.11\",\"shirtNumber\":\"31\",\"teamId\":\"10135\",\"x\":64,\"y\":52},{\"baseHeight\":0,\"event\":false,\"first\":\"1\",\"hasEvent\":true,\"homeTeam\":true,\"id\":\"1124955\",\"incidents\":[{\"addtime\":\"0\",\"belong\":\"1\",\"matchEvent\":{\"eventDes\":\"换下\",\"eventIconRes\":2131231159,\"type\":41},\"minute\":\"59\",\"time\":\"60\",\"type\":41}],\"logo\":\"http://cdn.sportnanoapi.com/football/player/0613d619ca07e91ed46e71b668942dc0.png\",\"name\":\"格林伍德\",\"position\":\"M\",\"positionName\":\"中场\",\"rating\":\"6.24\",\"shirtNumber\":\"11\",\"teamId\":\"10135\",\"x\":20,\"y\":70},{\"baseHeight\":0,\"event\":false,\"first\":\"1\",\"hasEvent\":true,\"homeTeam\":true,\"id\":\"84844\",\"incidents\":[{\"addtime\":\"0\",\"belong\":\"1\",\"matchEvent\":{\"eventDes\":\"换下\",\"eventIconRes\":2131231159,\"type\":41},\"minute\":\"74\",\"time\":\"75\",\"type\":41}],\"logo\":\"http://cdn.sportnanoapi.com/football/player/b67ef3319066abf30541c01911254a60.png\",\"name\":\"桑乔\",\"position\":\"M\",\"positionName\":\"中场\",\"rating\":\"6.21\",\"shirtNumber\":\"25\",\"teamId\":\"10135\",\"x\":80,\"y\":70},{\"baseHeight\":0,\"event\":false,\"first\":\"1\",\"hasEvent\":false,\"homeTeam\":true,\"id\":\"14650\",\"logo\":\"http://cdn.sportnanoapi.com/football/player/ad07197931e66b846ebeb9cf1098a22e.png\",\"name\":\"卡瓦尼\",\"position\":\"F\",\"positionName\":\"前锋\",\"rating\":\"6.32\",\"shirtNumber\":\"21\",\"teamId\":\"10135\",\"x\":35,\"y\":90},{\"baseHeight\":0,\"event\":false,\"first\":\"1\",\"hasEvent\":false,\"homeTeam\":true,\"id\":\"10156\",\"logo\":\"http://cdn.sportnanoapi.com/football/player/8a6020f1ab3914523d4b2ca0921ad0f6.png\",\"name\":\"C罗\",\"position\":\"F\",\"positionName\":\"前锋\",\"rating\":\"5.66\",\"shirtNumber\":\"7\",\"teamId\":\"10135\",\"x\":65,\"y\":90}]";
    private String awayJson = "[{\"baseHeight\":0,\"event\":false,\"first\":\"1\",\"hasEvent\":true,\"homeTeam\":false,\"id\":\"44673\",\"incidents\":[{\"addtime\":\"4\",\"belong\":\"2\",\"matchEvent\":{\"eventDes\":\"黄牌\",\"eventIconRes\":2131231164,\"type\":3},\"minute\":\"93\",\"time\":\"90+4\",\"type\":3}],\"logo\":\"http://cdn.sportnanoapi.com/football/player/4adbea119c07426e74374ac2333dcf05.png\",\"name\":\"若泽·萨\",\"position\":\"G\",\"positionName\":\"守门员\",\"rating\":\"6.52\",\"shirtNumber\":\"1\",\"teamId\":\"10226\",\"x\":50,\"y\":12},{\"baseHeight\":0,\"event\":false,\"first\":\"1\",\"hasEvent\":false,\"homeTeam\":false,\"id\":\"1110217\",\"logo\":\"http://cdn.sportnanoapi.com/football/player/32d003dc7ad17c9cf3213cd608f0b1a2.png\",\"name\":\"基尔曼\",\"position\":\"D\",\"positionName\":\"后卫\",\"rating\":\"7.17\",\"shirtNumber\":\"23\",\"teamId\":\"10226\",\"x\":24,\"y\":32},{\"baseHeight\":0,\"event\":false,\"first\":\"1\",\"hasEvent\":false,\"homeTeam\":false,\"id\":\"28591\",\"logo\":\"http://cdn.sportnanoapi.com/football/player/e59a16ad7f54267a80360e202a03d44b.png\",\"name\":\"考迪\",\"position\":\"D\",\"positionName\":\"后卫\",\"rating\":\"6.89\",\"shirtNumber\":\"16\",\"teamId\":\"10226\",\"x\":50,\"y\":32},{\"baseHeight\":0,\"event\":false,\"first\":\"1\",\"hasEvent\":false,\"homeTeam\":false,\"id\":\"40254\",\"logo\":\"http://cdn.sportnanoapi.com/football/player/1f8e32cf05ddb72413708763785576cc.png\",\"name\":\"赛斯\",\"position\":\"D\",\"positionName\":\"后卫\",\"rating\":\"6.67\",\"shirtNumber\":\"27\",\"teamId\":\"10226\",\"x\":76,\"y\":32},{\"baseHeight\":0,\"event\":false,\"first\":\"1\",\"hasEvent\":false,\"homeTeam\":false,\"id\":\"44698\",\"logo\":\"http://cdn.sportnanoapi.com/football/player/f52c0e2292ae694545b7f04b64f087e8.png\",\"name\":\"塞梅多\",\"position\":\"M\",\"positionName\":\"中场\",\"rating\":\"7.25\",\"shirtNumber\":\"22\",\"teamId\":\"10226\",\"x\":13,\"y\":62},{\"baseHeight\":0,\"event\":false,\"first\":\"1\",\"hasEvent\":false,\"homeTeam\":false,\"id\":\"46283\",\"logo\":\"http://cdn.sportnanoapi.com/football/player/e7f077c64243f8764eefa6f7e8d5d1d1.png\",\"name\":\"内维斯\",\"position\":\"M\",\"positionName\":\"中场\",\"rating\":\"5.92\",\"shirtNumber\":\"8\",\"teamId\":\"10226\",\"x\":36,\"y\":62},{\"baseHeight\":0,\"event\":false,\"first\":\"1\",\"hasEvent\":true,\"homeTeam\":false,\"id\":\"11110\",\"incidents\":[{\"addtime\":\"0\",\"belong\":\"2\",\"matchEvent\":{\"eventDes\":\"进球\",\"eventIconRes\":2131231152,\"type\":1},\"minute\":\"81\",\"time\":\"82\",\"type\":1}],\"logo\":\"http://cdn.sportnanoapi.com/football/player/2030f9919159c72f04737c7ea53ca023.png\",\"name\":\"穆蒂尼奥\",\"position\":\"M\",\"positionName\":\"中场\",\"rating\":\"8.78\",\"shirtNumber\":\"28\",\"teamId\":\"10226\",\"x\":64,\"y\":62},{\"baseHeight\":0,\"event\":false,\"first\":\"1\",\"hasEvent\":false,\"homeTeam\":false,\"id\":\"35408\",\"logo\":\"http://cdn.sportnanoapi.com/football/player/f3001e498e441ac7f6038c05d7a12497.png\",\"name\":\"马萨尔\",\"position\":\"M\",\"positionName\":\"中场\",\"rating\":\"5.68\",\"shirtNumber\":\"5\",\"teamId\":\"10226\",\"x\":87,\"y\":62},{\"baseHeight\":0,\"event\":false,\"first\":\"1\",\"hasEvent\":true,\"homeTeam\":false,\"id\":\"76301\",\"incidents\":[{\"addtime\":\"0\",\"belong\":\"2\",\"matchEvent\":{\"eventDes\":\"换下\",\"eventIconRes\":2131231159,\"type\":41},\"minute\":\"65\",\"time\":\"66\",\"type\":41}],\"logo\":\"http://cdn.sportnanoapi.com/football/player/b081061b9dc198173548e8f11b8dadc7.png\",\"name\":\"特林康\",\"position\":\"F\",\"positionName\":\"前锋\",\"rating\":\"6.56\",\"shirtNumber\":\"11\",\"teamId\":\"10226\",\"x\":24,\"y\":90},{\"baseHeight\":0,\"event\":false,\"first\":\"1\",\"hasEvent\":true,\"homeTeam\":false,\"id\":\"40599\",\"incidents\":[{\"addtime\":\"0\",\"belong\":\"2\",\"matchEvent\":{\"eventDes\":\"换下\",\"eventIconRes\":2131231159,\"type\":41},\"minute\":\"80\",\"time\":\"81\",\"type\":41}],\"logo\":\"http://cdn.sportnanoapi.com/football/player/ffb3118590d1d0ad2772ea54a8e90ec5.png\",\"name\":\"希门尼斯\",\"position\":\"F\",\"positionName\":\"前锋\",\"rating\":\"6.2\",\"shirtNumber\":\"9\",\"teamId\":\"10226\",\"x\":50,\"y\":90},{\"baseHeight\":0,\"event\":false,\"first\":\"1\",\"hasEvent\":true,\"homeTeam\":false,\"id\":\"47956\",\"incidents\":[{\"addtime\":\"0\",\"belong\":\"2\",\"matchEvent\":{\"eventDes\":\"换下\",\"eventIconRes\":2131231159,\"type\":41},\"minute\":\"87\",\"time\":\"88\",\"type\":41}],\"logo\":\"http://cdn.sportnanoapi.com/football/player/d8c54fdafdf88504ec657d4099b68970.png\",\"name\":\"波登斯\",\"position\":\"F\",\"positionName\":\"前锋\",\"rating\":\"7.52\",\"shirtNumber\":\"10\",\"teamId\":\"10226\",\"x\":76,\"y\":90}]";
}