package level;

import enemies.Enemy;
import items.GoldCoin;
import items.HealthElixir;
import items.Item;
import items.MagicScroll;
import enemies.Skeleton;
import enemies.Vampire;
import enemies.Zombie;

import java.util.ArrayList;
import java.util.List;

public class LevelManager {
    private int level;
    private List<Enemy> enemies;
    private List<Item> items;

    public LevelManager() {
        this.level = 1;
        this.enemies = new ArrayList<>();
        this.items = new ArrayList<>();
        setupLevel();
    }

    private void setupLevel() {
        enemies.clear();
        items.clear();
        if (level == 1) {
            enemies.add(new Skeleton());
            enemies.add(new Zombie());
            items.add(new GoldCoin());
            items.add(new HealthElixir());
        } else if (level == 2) {
            enemies.add(new Vampire());
            items.add(new MagicScroll());
        } else if (level == 3) {
            enemies.add(new Vampire());
            enemies.add(new Zombie());
            items.add(new HealthElixir());
            items.add(new GoldCoin());
        }
    }

    public void advanceLevel() {
        level++;
        setupLevel();
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }

    public List<Item> getItems() {
        return items;
    }

    public int getLevel() {
        return level;
    }
}
