package com.example.untitledgame;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;

import androidx.annotation.Nullable;

public class Entity extends View {

    protected Point location;
    protected int height;
    protected int width;
    protected Bitmap image;

    public Entity(Context context, Point location, int height, int width, Bitmap image) {
        super(context);
        this.location = location;
        this.height = height;
        this.width = width;
        this.image = image;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        @SuppressLint("DrawAllocation") Rect r = new Rect(
                this.location.x, this.location.y,
                this.location.x + this.width,
                this.location.y + this. height);
        canvas.drawBitmap(this.image, null, r, null);
    }
}
