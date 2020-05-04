package com.ihoover;

import java.util.Objects;

public class Position {

    private Coordinates coordinates;
    private Orientation orientation;

    public Position(Coordinates coordinates,Orientation orientation) {
        this.coordinates = coordinates;
        this.orientation = orientation;
    }

    public Position turnRigth(){
        return new Position(coordinates,orientation.turnRight());
    }

    public Position turnLeft(){
        return new Position(coordinates,orientation.turnLeft());
    }

    public Position advance() {
        Coordinates newCoordinates = this.getNextCoordinates();
        return new Position(newCoordinates,orientation);
    }

    private Coordinates getNextCoordinates(){
        switch (orientation){
            case N:
                return coordinates.northNeighbour();
            case S:
                return coordinates.southNeighbour();
            case E:
                return coordinates.eastNeighbour();
            case W:
                return coordinates.westNeighbour();
            default:
                return coordinates;
        }
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return coordinates.equals(position.coordinates) &&
                orientation == position.orientation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinates, orientation);
    }

    @Override
    public String toString() {
        return "I am at " + coordinates + ", looking at " + orientation.getLabel();
    }
}
