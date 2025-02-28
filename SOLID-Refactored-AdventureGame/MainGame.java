
import player.Player;
import combat.CombatManager;
import level.LevelManager;
import enemies.Enemy;
import items.Item;

public class MainGame {
	public static void main(String[] args) {
		Player player = new Player("Adventurer");
		LevelManager levelManager = new LevelManager();

		while (levelManager.getLevel() <= 3 && player.getHealth() > 0) {
			System.out.println("=== Level " + levelManager.getLevel() + " ===");
			for (Enemy enemy : levelManager.getEnemies()) {
				CombatManager.fight(player, enemy);
				if (player.getHealth() <= 0) {
					System.out.println("Game Over");
					return;
				}
			}
			for (Item item : levelManager.getItems()) {
				System.out.println(player.getName() + " picks up " + item.getName());
				item.use(player);
			}
			if (player.getHealth() > 0) {
				levelManager.advanceLevel();
			}
		}
		System.out.println("Congratulations! Adventure completed with " + player.getExperience() + " experience points!");
	}
}
