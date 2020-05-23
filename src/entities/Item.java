package entities;

public class Item {
    private int bonus;
    private int onus;
    private Position position;
    private int quantity;

    public int getBonus() {
        return bonus;
    }

    public int getOnus() {
        return onus;
    }

    public Position getPosition() {
        return position;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void setOnus(int onus) {
        this.onus = onus;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}