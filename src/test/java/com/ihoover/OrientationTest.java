package com.ihoover;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrientationTest {

    @Test
    public void Right_Of_North_Is_East(){
        Orientation orientation = Orientation.N.turnRight();
        assertEquals(Orientation.E,orientation);
    }

    @Test
    public void Left_Of_North_Is_West(){
        Orientation orientation = Orientation.N.turnLeft();
        assertEquals(Orientation.W,orientation);
    }

    @Test
    public void Right_Of_South_Is_West(){
        Orientation orientation = Orientation.S.turnRight();
        assertEquals(Orientation.W,orientation);
    }

    @Test
    public void Left_Of_South_Is_East(){
        Orientation orientation = Orientation.S.turnLeft();
        assertEquals(Orientation.E,orientation);
    }

    @Test
    public void Right_Of_East_Is_South(){
        Orientation orientation = Orientation.E.turnRight();
        assertEquals(Orientation.S,orientation);
    }

    @Test
    public void Left_Of_East_Is_North(){
        Orientation orientation = Orientation.E.turnLeft();
        assertEquals(Orientation.N,orientation);
    }

    @Test
    public void Right_Of_West_Is_North(){
        Orientation orientation = Orientation.W.turnRight();
        assertEquals(Orientation.N,orientation);
    }

    @Test
    public void Left_Of_West_Is_South(){
        Orientation orientation = Orientation.W.turnLeft();
        assertEquals(Orientation.S,orientation);
    }

}