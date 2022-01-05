package com.volleycn.lineupview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.LayoutRes;


import java.util.ArrayList;
import java.util.List;

import util.SizeUtils;

public abstract class LineUpAdapter<T extends LineUpData> {
    private LineUpView lineUpView;
    private List<T> list = new ArrayList<>();
    private int memberEventViewLayoutId;
    private int memberViewLayoutId;
    private LayoutInflater inflater;
    protected Context context;

    public LineUpAdapter(Context context, @LayoutRes int memberViewLayoutId, @LayoutRes int memberEventViewLayoutId) {
        this.context = context;
        this.inflater = LayoutInflater.from(context);
        this.memberViewLayoutId = memberViewLayoutId;
        this.memberEventViewLayoutId = memberEventViewLayoutId;
    }

    private View createVew(@LayoutRes int layoutId) {
        return inflater.inflate(layoutId, null);
    }

    public void setList(List<T> data) {
        try {
            this.list.clear();
            this.list.addAll(data);
            buildLineUpView();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void buildLineUpView() {
        try {
            if (lineUpView == null) {
                return;
            }
            lineUpView.removeAllViews();
            for (int i = 0; i < list.size(); i++) {
                T t = list.get(i);
                View memberView = onInitMemberView(createVew(memberViewLayoutId), t);
                memberView.setTag(t);
                lineUpView.addView(memberView);
                if (t.hasEvent) {
                    T event = (T) t.clone();
                    event.event = true;
                    event.baseHeight = SizeUtils.getMeasuredHeight(memberView);
                    View memberEventView = onInitMemberEventView(createVew(memberEventViewLayoutId), event);
                    memberEventView.setTag(event);
                    lineUpView.addView(memberEventView);
                }
            }
            lineUpView.requestLayout();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public abstract View onInitMemberView(View memberView, T bean);

    public abstract View onInitMemberEventView(View memberEventView, T bean);

    public void setLineUpView(LineUpView lineUpView) {
        this.lineUpView = lineUpView;
    }
}