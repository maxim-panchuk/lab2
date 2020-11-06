package com.maxim;

import ru.ifmo.se.pokemon.*;

public class Dhelmise extends Pokemon {
    public Dhelmise(String name, int level) {
        super(name, level);
        setStats(70, 131, 100, 86, 90, 40);
        setMove(new DracoMeteor(), new SteelWing(), new Flamethrower(), new DragonClaw());
        setType(Type.GHOST, Type.GRASS);
    }
}