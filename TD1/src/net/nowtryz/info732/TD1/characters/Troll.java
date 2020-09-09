package net.nowtryz.info732.TD1.characters;


import net.nowtryz.info732.TD1.Logger;

public class Troll extends Character {
    public Troll() {
        super("axe");
    }

    @Override
    public void fight() {
        Logger.getLogger().info("Troll is using " + this.getWeaponBehavior().getName());
        this.getWeaponBehavior().useWeapon();
    }
}
