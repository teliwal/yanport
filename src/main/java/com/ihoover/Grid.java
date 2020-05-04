package com.ihoover;

public class Grid {

    private int length;
    private int width;

    public Grid(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public boolean isOutOfGrid(Coordinates coordinates){
        if(coordinates.getX() < 0 || coordinates.getX() >= this.length){
            return true;
        }
        return (coordinates.getY() < 0 || coordinates.getY() >= this.width);
    }
}
