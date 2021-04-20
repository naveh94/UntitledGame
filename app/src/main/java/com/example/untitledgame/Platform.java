package com.example.untitledgame;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;

public class Platform extends Entity {

    public Platform(Context context, Point location, int height, int width, Bitmap image) {
        super(context, location, height, width, image);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
    }
}
