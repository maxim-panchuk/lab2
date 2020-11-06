package com.maxim;

import ru.ifmo.se.pokemon.*;

public class Mismagius extends Misdreavus{
    public Mismagius(String name, int level){
        super(name, level);
        setStats(60, 60, 60, 105, 105, 105);
        setMove(new Growl(), new CalmMind(), new AerialAce(), new EnergyBall());
        setType(Type.GHOST);
    }
}
