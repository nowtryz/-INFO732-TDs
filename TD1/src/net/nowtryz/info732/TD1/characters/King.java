package net.nowtryz.info732.TD1.characters;

import net.nowtryz.info732.TD1.Logger;

public class King extends Character {
    @Override
    public void fight() {
        this.getWeaponBehavior().useWeapon();
        Logger.getLogger().info("net.nowtryz.info732.TD1.characters.King is using " + this.getWeaponBehavior().getName());
    }
}
