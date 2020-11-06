package com.maxim;

import ru.ifmo.se.pokemon.*;

public class Misdreavus extends Pokemon{
    public Misdreavus(String name, int level){
        super(name, level);
        setStats(60, 60, 60, 85, 85, 85);
        setMove(new Growl(), new CalmMind(), new AerialAce());
        setType(Type.GHOST);
    }
}
