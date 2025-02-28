package player;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int health;
    private int experience;
    private List<String> inventory;

    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.experience = 0;
        this.inventory = new ArrayList<>();
    }

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setInventory(List<String> inventory) {
        this.inventory = inventory;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public void gainExperience(int exp) {
        this.experience += exp;
    }

    public void addItem(String item) {
        this.inventory.add(item);
    }

    public int getHealth() {
        return health;
    }

    public int getExperience() {
        return experience;
    }

    public List<String> getInventory() {
        return inventory;
    }
}
