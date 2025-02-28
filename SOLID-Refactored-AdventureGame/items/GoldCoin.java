package items;

import player.Player;

public class GoldCoin extends Item {
    public GoldCoin() {
        super("Gold Coin");
    }

    @Override
    public void use(Player player) {
        player.gainExperience(5);
    }
}
