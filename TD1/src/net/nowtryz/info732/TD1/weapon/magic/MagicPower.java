package net.nowtryz.info732.TD1.weapon.magic;

import net.nowtryz.info732.TD1.weapon.WeaponBehavior;

public abstract class MagicPower implements WeaponBehavior {
    private final WeaponBehavior weaponBehavior;

    public MagicPower(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    @Override
    public final void useWeapon() {
        this.weaponBehavior.useWeapon();
        this.useMagic();
    }

    @Override
    public String getName() {
        return this.weaponBehavior.getName();
    }

    protected abstract void useMagic();
}
