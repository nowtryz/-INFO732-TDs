package net.nowtryz.info732.TD1.characters;

import net.nowtryz.info732.TD1.Logger;

public class Queen extends Character {
    @Override
    public void fight() {
        this.getWeaponBehavior().useWeapon();
        Logger.getLogger().info("net.nowtryz.info732.TD1.characters.Queen is using " + this.getWeaponBehavior().getName());
    }
}
