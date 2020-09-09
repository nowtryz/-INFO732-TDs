package net.nowtryz.info732.TD1;

import net.nowtryz.info732.TD1.birds.Duck;
import net.nowtryz.info732.TD1.birds.DuckAdapter;
import net.nowtryz.info732.TD1.characters.Character;
import net.nowtryz.info732.TD1.characters.CharacterFactory;
import net.nowtryz.info732.TD1.characters.King;
import net.nowtryz.info732.TD1.weapon.SwordBehavior;
import net.nowtryz.info732.TD1.weapon.magic.ExplosionPower;

public class Game {
    public static void main(String[] args) {
        Character troll = CharacterFactory.createOverKillCharacter("troll", "sword");
        assert troll != null;

        King king = new King();
        king.setWeaponBehavior(new ExplosionPower(new SwordBehavior()));

        Character duck = new DuckAdapter(new Duck());

        troll.fight();
        king.fight();
        duck.fight();
    }
}
