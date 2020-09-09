package net.nowtryz.info732.TD1.characters;

import net.nowtryz.info732.TD1.Logger;

public class Knight extends Character {
    public Knight() {
        super("sword", "bow");
    }

    @Override
    public void fight() {
        Logger.getLogger().info("Knight is using " + this.getWeaponBehavior().getName());
        this.getWeaponBehavior().useWeapon();
    }
}
