package net.nowtryz.info732.TD1.characters;

import net.nowtryz.info732.TD1.Logger;

public class King extends Character {
    public King() {
        super("sword");
    }

    @Override
    public void fight() {
        Logger.getLogger().info("King is using " + this.getWeaponBehavior().getName());
        this.getWeaponBehavior().useWeapon();
    }
}
