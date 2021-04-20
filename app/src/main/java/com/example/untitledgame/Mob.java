package com.example.untitledgame;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;

public class Mob extends Entity {

    protected int maxHealth;
    protected int currentHealth;
    protected int speed;

    public Mob(Context context, Point location, int height,
               int width, Bitmap image, int maxHealth, int speed) {
        super(context, location, height, width, image);
        this.currentHealth = this.maxHealth = maxHealth;
        this.speed = speed;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public void move(Direction direction) {
        switch(direction) {
            case LEFT:
               this.location.x -= this.speed;
               break;
            case RIGHT:
                this.location.x += this.speed;
                break;
            default:
                return;
        }
    }
}
