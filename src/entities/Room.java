package entities;

import java.util.ArrayList;

public class Room {
    private ArrayList<Item> items;
    private ArrayList<Sensor> sensors;

    public Room() {
        this.items = new ArrayList<Item>();
        this.sensors = new ArrayList<Sensor>();
    }



    @Override
    public String toString() {
        return String.format(
            "Room: {Items: %s, Sensors: %s}", 
            this.items.toString(),
            this.sensors.toString()
        );
    }
}