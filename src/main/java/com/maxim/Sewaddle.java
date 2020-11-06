package com.maxim;

import ru.ifmo.se.pokemon.*;

public class Sewaddle extends Pokemon{
    public Sewaddle(String name, int level) {
        super(name, level);
        setStats(45, 53, 70, 40, 60, 42);
        setMove(new Rest(), new DreamEater());
        setType(Type.BUG, Type.GRASS);
    }
}
