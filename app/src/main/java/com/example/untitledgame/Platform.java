package com.example.untitledgame;

import android.graphics.Point;
import android.graphics.Rect;

public interface Platform {
    Point getLocation();
    Rect getSize();
}
