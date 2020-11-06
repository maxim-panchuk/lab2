package com.maxim;

import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class App 
{
    public static void main( String[] args )
    {
        Battle war = new Battle();

        Pokemon dhelmise = new Dhelmise("Dhelmise", 7);
        Pokemon misdreavus = new Misdreavus("Misdreavus", 2);
        Pokemon mismagius = new Mismagius("Mismagius", 4);
        Pokemon sewaddle = new Sewaddle("Sewaddle", 5);
        Pokemon swadloon = new Swadloon("Swadloon", 5);
        Pokemon lavanny = new Leavanny("Leavanny", 5);


        war.addAlly(dhelmise);
        war.addAlly(misdreavus);
        war.addAlly(mismagius);
        war.addFoe(sewaddle);
        war.addFoe(swadloon);
        war.addFoe(lavanny);

        war.go();
    }
}
