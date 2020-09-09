package net.nowtryz.info732.TD1.birds;

import net.nowtryz.info732.TD1.characters.Character;

public class DuckAdapter extends Character {
    private final Duck duck;

    public DuckAdapter(Duck duck) {
        super();
        this.duck = duck;
    }

    @Override
    public void fight() {
        this.duck.combat();
    }
}
