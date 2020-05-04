package com.ihoover;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CoordinatesTest {

    @Test
    public void northNeighbour_Is_Neighbour_With_Y_incremented(){
        Coordinates origin = new Coordinates(3,4);

        Coordinates neighbour = origin.northNeighbour();

        assertNotEquals(origin,neighbour);
        assertEquals(origin.getX(),neighbour.getX());
        assertEquals(origin.getY() + 1,neighbour.getY());
    }

    @Test
    public void soutNeighbour_Is_Neighbour_With_Y_decremented(){
        Coordinates origin = new Coordinates(3,4);

        Coordinates neighbour = origin.southNeighbour();

        assertNotEquals(origin,neighbour);
        assertEquals(origin.getX(),neighbour.getX());
        assertEquals(origin.getY() - 1,neighbour.getY());
    }

    @Test
    public void eastNeighbour_Is_Neighbour_With_X_incremented(){
        Coordinates origin = new Coordinates(3,4);

        Coordinates neighbour = origin.eastNeighbour();

        assertNotEquals(origin,neighbour);
        assertEquals(origin.getY(),neighbour.getY());
        assertEquals(origin.getX() + 1,neighbour.getX());
    }

    @Test
    public void westNeighbour_Is_Neighbour_With_X_decremented(){
        Coordinates origin = new Coordinates(3,4);

        Coordinates neighbour = origin.westNeighbour();

        assertNotEquals(origin,neighbour);
        assertEquals(origin.getY(),neighbour.getY());
        assertEquals(origin.getX() -1 ,neighbour.getX());
    }
}