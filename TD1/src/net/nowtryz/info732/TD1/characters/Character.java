package net.nowtryz.info732.TD1.characters;

import net.nowtryz.info732.TD1.Logger;
import net.nowtryz.info732.TD1.weapon.WeaponBehavior;

import java.util.Arrays;
import java.util.List;

public abstract class Character {
    protected final List<Class<?>> bestWeapons;
    private WeaponBehavior weaponBehavior;

    public Character(Class<?>... bestWeapons) {
        this.bestWeapons = Arrays.asList(bestWeapons);
    }

    public abstract void fight();

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;

        if (!this.bestWeapons.contains(weaponBehavior.getClass())) {
            Logger.getLogger().warn(this.getType() + " is very bad with " + weaponBehavior.getName() + "s");
        }
    }

    public WeaponBehavior getWeaponBehavior() {
        return weaponBehavior;
    }

    public String getType() {
        return this.getClass().getName();
    }
}
