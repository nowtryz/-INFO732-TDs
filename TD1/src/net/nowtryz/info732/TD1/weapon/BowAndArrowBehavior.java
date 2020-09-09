package net.nowtryz.info732.TD1.weapon;

import net.nowtryz.info732.TD1.Logger;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        Logger.getLogger().info("Bow used");
    }

    @Override
    public String getName() {
        return "bow";
    }
}
