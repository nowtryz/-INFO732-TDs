package net.nowtryz.info732.TD1;

import net.nowtryz.info732.TD1.characters.King;
import net.nowtryz.info732.TD1.characters.Troll;
import net.nowtryz.info732.TD1.weapon.AxeBehavior;
import net.nowtryz.info732.TD1.weapon.SwordBehavior;
import net.nowtryz.info732.TD1.weapon.magic.DarknessPower;
import net.nowtryz.info732.TD1.weapon.magic.ExplosionPower;

public class Game {
    public static void main(String[] args) {
        Troll troll = new Troll();
        King king = new King();

        troll.setWeaponBehavior(new SwordBehavior());
        troll.setWeaponBehavior(new AxeBehavior());
        king.setWeaponBehavior(new DarknessPower(new ExplosionPower(new SwordBehavior())));

        troll.fight();
        king.fight();
    }
}
