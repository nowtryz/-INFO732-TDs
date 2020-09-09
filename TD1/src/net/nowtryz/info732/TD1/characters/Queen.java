package net.nowtryz.info732.TD1.characters;

import net.nowtryz.info732.TD1.Logger;

public class Queen extends Character {
    public Queen() {
        super("knife");
    }

    @Override
    public void fight() {
        Logger.getLogger().info("Queen is using " + this.getWeaponBehavior().getName());
        this.getWeaponBehavior().useWeapon();
    }
}
