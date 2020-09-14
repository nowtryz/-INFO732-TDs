package net.nowtryz.info732.TD1.characters;

import net.nowtryz.info732.TD1.weapon.*;
import net.nowtryz.info732.TD1.weapon.magic.DarknessPower;
import net.nowtryz.info732.TD1.weapon.magic.ExplosionPower;

public class CharacterFactory {
    public static Character createCharacter(String type, String weapon) {
        Character base = createCharacter(type);
        WeaponBehavior baseWeapon = createBaseWeapon(weapon);
        if (base == null || baseWeapon == null) return null;

        base.setWeaponBehavior(baseWeapon);
        return base;
    }

    public static Character createOverKillCharacter(String type, String weapon) {
        Character base = createCharacter(type);
        WeaponBehavior baseWeapon = createBaseWeapon(weapon);
        if (base == null || baseWeapon == null) return null;

        base.setWeaponBehavior(new DarknessPower(new ExplosionPower(baseWeapon)));
        return base;
    }

    public static WeaponBehavior createBaseWeapon(String type) {
        return switch (type.toLowerCase()) {
            case "axe" -> new AxeBehavior();
            case "bow" -> new BowAndArrowBehavior();
            case "knife" -> new KnifeBehavior();
            case "sword" -> new SwordBehavior();
            default -> null;
        };
    }

    public static Character createCharacter(String type) {
        return switch (type.toLowerCase()) {
            case "king" -> new King();
            case "Queen" -> new Queen();
            case "Knight" -> new Knight();
            case "Troll" -> new Troll();
            default -> null;
        };
    }
}
