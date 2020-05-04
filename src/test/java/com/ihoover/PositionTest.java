package com.ihoover;


import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PositionTest {

    @Rule
    public ExpectedException expected= ExpectedException.none();

    @Test
    public void turnRight_ChangeOrientation_PreserveCoordinates(){
        Coordinates coordinates = new Coordinates(3,5);
        Position position = new Position(coordinates,Orientation.N);
        Position newPosition = position.turnRigth();

        assertNotEquals(position,newPosition);
        assertEquals(coordinates,newPosition.getCoordinates());
        assertNotEquals(Orientation.N,newPosition.getOrientation());
        assertEquals(Orientation.E,newPosition.getOrientation());
    }

    @Test
    public void turnLeft_ChangeOrientation_PreserveCoordinates(){
        Coordinates coordinates = new Coordinates(3,5);
        Position position = new Position(coordinates,Orientation.N);

        Position newPosition = position.turnLeft();

        assertNotEquals(position,newPosition);
        assertEquals(coordinates,newPosition.getCoordinates());
        assertNotEquals(Orientation.N,newPosition.getOrientation());
        assertEquals(Orientation.W,newPosition.getOrientation());
    }

    @Test
    public void advancing_ChangeCoordinates_PreserveOrientation() {
        Coordinates coordinates = new Coordinates(3,5);
        Position position = new Position(coordinates,Orientation.N);

        Position newPosition = position.advance();

        assertNotEquals(position,newPosition);
        assertEquals(Orientation.N,newPosition.getOrientation());
        assertNotEquals(coordinates,newPosition.getCoordinates());
        assertEquals(3,newPosition.getCoordinates().getX());
        assertEquals(6,newPosition.getCoordinates().getY());
    }

}