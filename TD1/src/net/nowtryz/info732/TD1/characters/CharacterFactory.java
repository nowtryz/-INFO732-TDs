package net.nowtryz.info732.TD1.characters;

import net.nowtryz.info732.TD1.weapon.*;
import net.nowtryz.info732.TD1.weapon.magic.DarknessPower;
import net.nowtryz.info732.TD1.weapon.magic.ExplosionPower;

public class CharacterFactory {
    public static Character createOverKillCharacter(String type, String weapon) {
        Character base;
        switch (type.toLowerCase()) {
            case "king":
                base = new King();
                break;
            case "Queen":
                base = new Queen();
                break;
            case "Knight":
                base = new Knight();
                break;
            case "Troll":
                base = new Troll();
                break;
            default:
                return null;
        }

        WeaponBehavior baseWeapon;
        switch (weapon.toLowerCase()) {
            case "axe":
                baseWeapon = new AxeBehavior();
                break;
            case "bow":
                baseWeapon = new BowAndArrowBehavior();
                break;
            case "knife":
                baseWeapon = new KnifeBehavior();
                break;
            case "sword":
                baseWeapon = new SwordBehavior();
                break;
            default:
                return null;
        }

        base.setWeaponBehavior(new DarknessPower(new ExplosionPower(baseWeapon)));
        return base;
    }
}
