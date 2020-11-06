package com.maxim;

import ru.ifmo.se.pokemon.*;

public class Swadloon extends Sewaddle{
    public Swadloon(String name, int level){
        super(name, level);
        setStats(55, 63, 90, 50, 80, 42);
        setMove(new Rest(), new DreamEater(), new GrassWhistle());
        setType(Type.BUG, Type.GRASS);
    }
}
