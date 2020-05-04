package com.ihoover;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args){
        String parcours = "AGGAGAADA";
        List<Command> commands = createCommandListFromString(parcours);
        Grid grid = new Grid(10,10);
        Position origin = new Position(new Coordinates(1,5),Orientation.N);
        if(grid.isOutOfGrid(origin.getCoordinates())){
            throw new IllegalArgumentException("L'aspirateur ne peut pas etre en dehors de la grille");
        }

        Vacuum vacuum = new Vacuum(origin,grid,commands);
        Position destination = vacuum.run();
        System.out.println(destination);
    }

    private static List<Command> createCommandListFromString(String input){
        List<Command> result = new ArrayList<>();
        for(Character c : input.toCharArray()){
            result.add(Command.valueOf(c.toString()));
        }
        return result;
    }
}
