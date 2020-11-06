package com.maxim;

import ru.ifmo.se.pokemon.*;

public class Leavanny extends Swadloon{
    public Leavanny(String name, int level){
        super(name, level);
        setStats(75, 103, 80, 70, 80, 92);
        setMove(new Rest(), new DreamEater(), new GrassWhistle(), new XScissor());
        setType(Type.BUG, Type.GRASS);
    }
}
