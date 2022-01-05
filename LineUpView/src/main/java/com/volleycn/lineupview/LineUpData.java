package com.volleycn.lineupview;

import androidx.annotation.NonNull;

public class LineUpData implements Cloneable {

    public int x;
    public int y;
    public boolean event;
    public int baseHeight;
    public boolean hasEvent;
    public boolean homeTeam;

    @NonNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
