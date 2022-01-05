package com.volleycn.lineupview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class LineUpView extends ViewGroup {
    public LineUpView(Context context) {
        super(context);
    }

    public LineUpView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LineUpView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public LineUpView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        try {
            int sizeWidth = MeasureSpec.getSize(widthMeasureSpec);
            int sizeHeight = MeasureSpec.getSize(heightMeasureSpec);
            int modeWidth = MeasureSpec.getMode(widthMeasureSpec);
            int modeHeight = MeasureSpec.getMode(heightMeasureSpec);
            for (int i = 0, childCount = getChildCount(); i < childCount; i++) {
                View childView = getChildAt(i);
                measureChild(childView, widthMeasureSpec, heightMeasureSpec);
                setMeasuredDimension(modeWidth == MeasureSpec.EXACTLY ? sizeWidth : sizeWidth,
                        modeHeight == MeasureSpec.EXACTLY ? sizeHeight : sizeHeight);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setAdapter(LineUpAdapter memberAdapter) {
        this.mMemberAdapter = memberAdapter;
        this.mMemberAdapter.setLineUpView(this);
        requestLayout();
    }

    private float baseAxisX = 100f;
    private float baseAxisY = 100f;

    public void setBaseCoordinate(int axisX, int axisY) {
        this.baseAxisX = axisX;
        this.baseAxisY = axisY;
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        try {
            int pw = getMeasuredWidth();
            int pH = getMeasuredHeight();
            float ratioX = pw / baseAxisX;
            float ratioY = pH / baseAxisY;
            for (int i = 0; i < getChildCount(); i++) {
                View childView = getChildAt(i);
                LineUpData lineUpData = (LineUpData) childView.getTag();
                int realX = lineUpData.homeTeam ? lineUpData.x : (int) (baseAxisX - lineUpData.x);
                int realY = lineUpData.homeTeam ? lineUpData.y : (int) (baseAxisX - lineUpData.y);
                int x = (int) (realX * ratioX);
                int y = (int) (realY * ratioY);
                int width = childView.getMeasuredWidth();
                int height = childView.getMeasuredHeight();
                int left;
                int right;
                int top;
                int bottom;
                if (lineUpData.event) {
                    left = x;
                    right = x + width;
                    top = (int) (y - lineUpData.baseHeight / 2.0f - height / 2.0f);
                    bottom = (int) (y - lineUpData.baseHeight / 2.0f + height / 2.0f);
                } else {
                    left = (int) (x - width / 2.0f);
                    right = (int) (x + width / 2.0f);
                    top = (int) (y - height / 2.0f);
                    bottom = (int) (y + height / 2.0f);
                }
                childView.layout(left, top, right, bottom);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public LineUpAdapter mMemberAdapter;
}
