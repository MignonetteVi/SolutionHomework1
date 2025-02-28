package enemies;

public abstract class Enemy {
    protected String name;
    protected int damage;
    protected int experience;

    public Enemy(String name, int damage, int experience) {
        this.name = name;
        this.damage = damage;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getExperience() {
        return experience;
    }
}
