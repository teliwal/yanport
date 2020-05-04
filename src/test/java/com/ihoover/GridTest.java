package com.ihoover;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GridTest {

    @Test
    public void coordinates_WithNegative_X_isOutOfGrid(){
        Grid grid = new Grid(10,10);
        Coordinates coordinates = new Coordinates(-1,3);
        boolean isOut = grid.isOutOfGrid(coordinates);
        assertTrue(isOut);
    }

    @Test
    public void coordinates_WithNegative_Y_isOutOfGrid(){
        Grid grid = new Grid(10,10);
        Coordinates coordinates = new Coordinates(2,-2);
        boolean isOut = grid.isOutOfGrid(coordinates);
        assertTrue(isOut);
    }

    @Test
    public  void coordinates_With_X_higherThanGridLength_isOut(){
        Grid grid = new Grid(10,10);
        Coordinates coordinates = new Coordinates(11,3);
        boolean isOut = grid.isOutOfGrid(coordinates);
        assertTrue(isOut);
    }

    @Test
    public  void coordinates_With_X_EqaulToGridLength_isOut(){
        Grid grid = new Grid(10,10);
        Coordinates coordinates = new Coordinates(10,3);
        boolean isOut = grid.isOutOfGrid(coordinates);
        assertTrue(isOut);
    }

    @Test
    public  void coordinates_With_Y_higherThanGridWidth_isOut(){
        Grid grid = new Grid(10,10);
        Coordinates coordinates = new Coordinates(1,14);
        boolean isOut = grid.isOutOfGrid(coordinates);
        assertTrue(isOut);
    }

    @Test
    public  void coordinates_With_X_EqualToGridWidth_isOut(){
        Grid grid = new Grid(10,10);
        Coordinates coordinates = new Coordinates(2,10);
        boolean isOut = grid.isOutOfGrid(coordinates);
        assertTrue(isOut);
    }
}