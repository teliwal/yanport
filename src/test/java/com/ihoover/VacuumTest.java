package com.ihoover;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class VacuumTest {

    @Test
    public void vacuum_Run_Until_End_Of_Commands(){
        Grid grid = new Grid(10,10);
        Position position = new Position(new Coordinates(5,5),Orientation.N);
        List<Command> commands = Arrays.asList(Command.D, Command.A, Command.D, Command.A, Command.D, Command.A,
                Command.D, Command.A, Command.A);
        Vacuum vacuum = new Vacuum(position,grid, commands);

        Position newPosition = vacuum.run();

        Position expectedPosition = new Position(new Coordinates(5,6),Orientation.N);
        assertEquals(expectedPosition,newPosition);
    }

    @Test
    public void vacuum_Run_Until_Hit_Wall(){
        Grid grid = new Grid(10,10);
        Position position = new Position(new Coordinates(5,8),Orientation.N);// avec cette position l'aspirateur
        //ne peut avancer qu'une seule fois vers le nord,si la 2eme commande est Avancer, l'aspirateur se bloque
        List<Command> commands = Arrays.asList(Command.A, Command.A, Command.D, Command.A,
                Command.D, Command.A, Command.A);
        Vacuum vacuum = new Vacuum(position,grid, commands);

        Position newPosition = vacuum.run();

        Position expectedPosition = new Position(new Coordinates(5,9),Orientation.N);
        assertEquals(expectedPosition,newPosition);
    }
}