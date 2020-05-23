package entities;

import entities.enums.SensorType;

public class Sensor {
    private Position position;
    private SensorType type;

    public Sensor(SensorType type, Position position) {
        this.type = type;
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }
    
    public void setPosition(Position position) {
        this.position = position;
    }

    public SensorType getType() {
        return type;
    }

    public void setType(SensorType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.type.name();
    }
}