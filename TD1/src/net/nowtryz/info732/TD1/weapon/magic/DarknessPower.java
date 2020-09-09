package net.nowtryz.info732.TD1.weapon.magic;

import net.nowtryz.info732.TD1.Logger;
import net.nowtryz.info732.TD1.weapon.WeaponBehavior;

public class DarknessPower extends MagicPower {
    public DarknessPower(WeaponBehavior weaponBehavior) {
        super(weaponBehavior);
    }

    @Override
    protected void useMagic() {
        Logger.getLogger().info("And the room became darker");
    }
}
