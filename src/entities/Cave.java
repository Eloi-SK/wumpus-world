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

    public void printAllCave() {
        for (Room[] row : this.rooms)
            System.out.println(Arrays.toString(row));
    }

}