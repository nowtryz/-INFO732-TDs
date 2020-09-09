package net.nowtryz.info732.TD1.weapon;

import net.nowtryz.info732.TD1.Logger;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        Logger.getLogger().info("Knife used");
    }

    @Override
    public String getName() {
        return "knife";
    }
}
