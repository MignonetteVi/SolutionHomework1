package items;

import player.Player;

public class HealthElixir extends Item {
    public HealthElixir() {
        super("Health Elixir");
    }

    @Override
    public void use(Player player) {
        player.takeDamage(-20);
    }
}
