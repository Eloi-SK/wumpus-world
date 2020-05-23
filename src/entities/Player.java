package entities;

public class Player extends Item {
    private boolean isAlive;
    private Position front;
    private Item[] collectibleItems;

    @Override
    public String toString() {
        return "Player";
    }
}