package net.nowtryz.info732.TD1.characters;

import net.nowtryz.info732.TD1.Logger;
import net.nowtryz.info732.TD1.castle.Castle;
import net.nowtryz.info732.TD1.castle.CastleListener;
import net.nowtryz.info732.TD1.weapon.WeaponBehavior;

import java.util.Arrays;
import java.util.List;

public abstract class Character implements CastleListener {
    protected final List<String> bestWeapons;
    private WeaponBehavior weaponBehavior;

    public Character(String... bestWeapons) {
        this.bestWeapons = Arrays.asList(bestWeapons);
        Castle.getInstance().register(this);
    }

    public abstract void fight();

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;

        if (!this.bestWeapons.contains(weaponBehavior.getName().toLowerCase())) {
            Logger.getLogger().warn(this.getType() + " is very bad with " + weaponBehavior.getName() + "s");
        }
    }

    @Override
    public void onCastleCollapsed(Castle castle) {}

    @Override
    public void onCastleCollapsing(Castle castle) {}

    public WeaponBehavior getWeaponBehavior() {
        return weaponBehavior;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }
}
