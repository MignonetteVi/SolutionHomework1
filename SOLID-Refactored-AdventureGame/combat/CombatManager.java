package combat;

import enemies.Enemy;
import player.Player;

public class CombatManager {
    public static void fight(Player player, Enemy enemy) {
        System.out.println(player.getName() + " engages in combat with " + enemy.getName() + "!");
        player.takeDamage(enemy.getDamage());
        player.gainExperience(enemy.getExperience());
        System.out.println("After combat: Health = " + player.getHealth() + ", Experience = " + player.getExperience());
    }
}
