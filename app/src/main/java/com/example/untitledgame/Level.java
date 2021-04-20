package com.example.untitledgame;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.LinkedList;
import java.util.List;

public class Level extends View {

    protected int height;
    protected int width;
    protected int viewedHeight;
    protected int viewedWidth;
    protected Point viewedCenter;
    protected Bitmap background;
    protected List<Entity>[] layers;

    public Level(Context context, int height, int width, Bitmap background) {
        super(context);
        this.height = height;
        this.width = width;
        this.layers = new List[3];
        this.layers[0] = new LinkedList<Entity>();
        this.layers[1] = new LinkedList<Entity>();
        this.layers[2] = new LinkedList<Entity>();
    }

    public void setViewedCenter(Point viewedCenter) {
        this.viewedCenter = viewedCenter;
    }

    public void addEntity(int layer, Entity e) {
        this.layers[layer].add(e);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);
    }
}
