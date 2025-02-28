package combat;

import enemies.Enemy;
import player.Player;
import score.ScoreManager;

public class CombatManager {
    public static void fight(Player player, Enemy enemy) {
        System.out.println(player.getName() + " engages in combat with " + enemy.getName() + "!");
        player.takeDamage(enemy.getDamage());
        player.gainExperience(enemy.getExperience());
        ScoreManager.updateScore(player.getExperience());
        System.out.println("After combat: Health = " + player.getHealth() + ", Experience = " + player.getExperience());
    }
}