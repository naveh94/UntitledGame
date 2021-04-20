package com.example.untitledgame;

public class MobControl {

    protected Mob mob;

    public MobControl(Mob mob) {
        this.mob = mob;
    }

    public void moveLeft() {
        mob.move(Direction.LEFT);
    }

    public void moveRight() {
        mob.move(Direction.RIGHT);
    }

    public void moveUp() {
        mob.move(Direction.UP);
    }

    public void moveDown() {
        mob.move(Direction.DOWN);
    }

    public void crouch() {
        //TODO
    }

    public void jump() {
        //TODO
    }

    public void ability1() {
        //TODO
    }

    public void ability2() {
        //TODO
    }

    public void ability3() {
        //TODO
    }
}
