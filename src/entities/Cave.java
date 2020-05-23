package entities;

import java.util.ArrayList;
import java.util.Arrays;

public class Cave {
    private Room[][] rooms;
    private Size size;

    public Cave(Size size) {
        this.size = size;
        this.rooms = new Room[size.getHeight()][size.getWidth()];
    }

    public void initialize() {
        for (int i = 0; i < this.size.getHeight(); i++) {
            for (int j = 0; j < this.size.getWidth(); j++) {
                this.rooms[i][j] = new Room();
            }
        }
    }

    public void addItem(Item item) {
        this.rooms[item.getPosition().getX()][item.getPosition().getY()].addItem(item);
    }

    public void printAllCave() {
        for (Room[] row : this.rooms)
            System.out.println(Arrays.toString(row));
    }

    public ArrayList<Position> getAdjacentCells(Position position) {
        ArrayList<Position> adjacentCells = new ArrayList<Position>();
        
        int x = position.getX();
        int y = position.getY();

        if (y - 1 >= 0) {
            adjacentCells.add(new Position(x, y - 1));
        }

        if (y + 1 <= this.size.getHeight()) {
            adjacentCells.add(new Position(x, y + 1));
        }

        if (x - 1 >= 0) {
            adjacentCells.add(new Position(x - 1, y));
        }

        if (x + 1 <= this.size.getWidth()) {
            adjacentCells.add(new Position(x + 1, y));
        }

        return adjacentCells;
    }
}