package items;

import player.Player;

public class MagicScroll extends Item {
    public MagicScroll() {
        super("Magic Scroll");
    }

    @Override
    public void use(Player player) {
        player.gainExperience(15);
    }
}
