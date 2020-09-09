package net.nowtryz.info732.TD1.weapon;

import net.nowtryz.info732.TD1.Logger;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        Logger.getLogger().info("Axe used");
    }

    @Override
    public String getName() {
        return "axe";
    }
}
