package com.ihoover;

import java.util.List;

public class Vacuum {

    private Position position;
    private Grid grid;
    private List<Command> commands;

    public Vacuum(Position position, Grid grid, List<Command> commands) {
        this.position = position;
        this.grid = grid;
        this.commands = commands;
    }

    public Position run(){
        Position newPosition = this.position;
        for (Command command : this.commands) {
            try {
                newPosition = this.move(newPosition, command);
            } catch (OutOfGridException e) {
                System.out.println(e.getMessage());
                //Quand on arrive a l'extremite de la grille ,on arrete le mouvement et les commandes restantes
                // ne sont pas executes
                break;
            }
        }
        this.position = newPosition;
        return this.position;
    }

    private Position move(Position position, Command command) throws OutOfGridException {
        if (command == Command.D) {
            return position.turnRigth();
        }
        if (command == Command.G){
            return position.turnLeft();
        }
        //on avance et on verifie si la nouvelle position est toujours dans la grille
        Position newPosition = position.advance();
        if(this.grid.isOutOfGrid(newPosition.getCoordinates())){
            throw new OutOfGridException("The aspirator hit the wall,it can not move forward");
        }
        return newPosition;
    }
}
