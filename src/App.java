import entities.*;
import entities.enums.SensorType;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Wumpus World - Cave");

        Cave cave = new Cave(new Size(4, 4));

        cave.initialize();

        Player p = new Player();

        p.setPosition(new Position(0, 0));

        cave.addItem(p);

        Wumpus w = new Wumpus();

        int pX = ThreadLocalRandom.current().nextInt(0, 4);
        int pY = ThreadLocalRandom.current().nextInt(0, 4);

        w.setPosition(new Position(pX, pY));

        cave.addItem(w);

        ArrayList<Position> adj = cave.getAdjacentCells(w.getPosition());

        for (Position pos : adj) {
            Sensor s = new Sensor(SensorType.Stench, pos);
            cave.addSensor(s);
        }

        cave.printAllCave();
    }
}
