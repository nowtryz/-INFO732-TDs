package net.nowtryz.info732.TD1.weapon;

import net.nowtryz.info732.TD1.Logger;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        Logger.getLogger().info("sword used");
    }

    @Override
    public String getName() {
        return "sword";
    }
}
