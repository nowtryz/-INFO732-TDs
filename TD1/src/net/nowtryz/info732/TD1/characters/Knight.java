package net.nowtryz.info732.TD1.characters;

import net.nowtryz.info732.TD1.Logger;

public class Knight extends Character {
    @Override
    public void fight() {
        this.getWeaponBehavior().useWeapon();
        Logger.getLogger().info("net.nowtryz.info732.TD1.characters.Knight is using " + this.getWeaponBehavior().getName());
    }
}
