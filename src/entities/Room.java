package entities;

import java.util.ArrayList;

public class Room {
    private ArrayList<Item> items;
    private ArrayList<Sensor> sensors;

    public Room() {
        this.items = new ArrayList<Item>();
        this.sensors = new ArrayList<Sensor>();
    }

    public void addItem(Item item) {
        this.items.add(item);
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