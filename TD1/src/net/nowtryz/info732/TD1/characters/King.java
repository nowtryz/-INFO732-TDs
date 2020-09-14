package net.nowtryz.info732.TD1.characters;

import net.nowtryz.info732.TD1.Logger;
import net.nowtryz.info732.TD1.castle.Castle;

public class King extends Character {
    public King() {
        super("sword");
    }

    @Override
    public void fight() {
        Logger.getLogger().info("King is using " + this.getWeaponBehavior().getName());
        this.getWeaponBehavior().useWeapon();
    }

    @Override
    public void onCastleCollapsing(Castle castle) {
        Logger.getLogger().warn("The king ran away");
    }
}
