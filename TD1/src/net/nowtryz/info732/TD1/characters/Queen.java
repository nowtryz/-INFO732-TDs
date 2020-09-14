package net.nowtryz.info732.TD1.characters;

import net.nowtryz.info732.TD1.Logger;
import net.nowtryz.info732.TD1.castle.Castle;

public class Queen extends Character {
    public Queen() {
        super("knife");
    }

    @Override
    public void fight() {
        Logger.getLogger().info("Queen is using " + this.getWeaponBehavior().getName());
        this.getWeaponBehavior().useWeapon();
    }

    @Override
    public void onCastleCollapsing(Castle castle) {
        Logger.getLogger().info("The queen is staying in the castle to protect it");
    }

    @Override
    public void onCastleCollapsed(Castle castle) {
        Logger.getLogger().warn("Well... The queen died protecting the castle");
    }
}
