package com.example.untitledgame;

import android.graphics.Point;
import android.graphics.Rect;

public interface Entity {
    void activateAI();
    Point getLocation();
    Boolean doesPhase();
    Rect getSize();
}
