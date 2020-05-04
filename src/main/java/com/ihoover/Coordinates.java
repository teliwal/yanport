package com.ihoover;

import java.util.Objects;

public class Coordinates {

    private int x;
    private int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordinates northNeighbour(){
        return new Coordinates(x,y + 1);
    }

    public Coordinates southNeighbour(){
        return new Coordinates(x, y - 1);
    }

    public Coordinates eastNeighbour(){
        return new Coordinates(x + 1, y);
    }

    public Coordinates westNeighbour(){
        return new Coordinates(x - 1, y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return x == that.x &&
                y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return " (" + x +"," + y + ")";
    }
}
