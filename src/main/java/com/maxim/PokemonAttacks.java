package com.maxim;

import ru.ifmo.se.pokemon.*;

class DracoMeteor extends SpecialMove{
    protected DracoMeteor(){
        super(Type.DRAGON, 130, 90);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK, -2);
    }
    @Override
    protected String describe(){
        return "Уменьшает ультимейт противника на 2";
    }
}

class SteelWing extends PhysicalMove{
    protected SteelWing(){
        super(Type.STEEL, 70, 90);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        if (Math.random() <= 0.1) p.setMod(Stat.SPECIAL_DEFENSE, 1);
    }
    @Override
    protected String describe(){
        return "Имеет 10% на увеличение защиты на 1";
    }
}

class Flamethrower extends SpecialMove{
    protected Flamethrower(){
        super(Type.FIRE, 90, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 1.0) Effect.burn(p);
    }
    @Override
    protected String describe(){
        return "Имеет 10% вероятность поджечь цель";
    }
}

class DragonClaw extends PhysicalMove{
    protected DragonClaw(){
        super(Type.DRAGON, 80, 100);
    }
}

class Growl extends StatusMove{
    protected Growl(){
        super(Type.NORMAL, 0, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, -1);
    }
    @Override
    protected String describe(){
        return "Уменьшает атаку цели на 1";
    }
}

class CalmMind extends StatusMove{
    protected CalmMind(){
        super(Type.PSYCHIC, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK, 1);
        p.setMod(Stat.SPECIAL_DEFENSE, 1);
    }
    @Override
    protected String describe(){
        return "Увеличивает ультимейт и специальную оборону на 1";
    }
}

class AerialAce extends PhysicalMove{
    protected AerialAce(){
        super(Type.FLYING, 60, 999999999);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ACCURACY, 0);
        p.setMod(Stat.EVASION, 0);
    }
    @Override
    protected String describe(){
        return "Наносит урон, игнорируя уклонение и точность";
    }
}

class EnergyBall extends SpecialMove{
    protected EnergyBall(){
        super(Type.GRASS, 90, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.1) p.setMod(Stat.SPECIAL_DEFENSE, -1);
    }
    @Override
    protected String describe(){
        return "Имеет 10 % шанс на уменьшение специальной защиты противника на 1";
    }
}

class Rest extends StatusMove{
    protected Rest(){
        super(Type.PSYCHIC, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect e = new Effect().turns(2);
        p.addEffect(e);
        Effect.sleep(p);
        p.setMod(Stat.HP, 100);
    }
}

class DreamEater extends SpecialMove{
    protected DreamEater(){
        super(Type.PSYCHIC, 100, 100);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        Status PokCon = def.getCondition();
        if (PokCon.equals(Status.SLEEP)) {
            def.setMod(Stat.HP, (int) Math.round(damage));
        }
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.HP, 50);
    }
    @Override
    protected String describe(){
        return "Если противник во сне, наосит урон и восстанавливает сам себе половину от причиненного урона";
    }
}

class GrassWhistle extends StatusMove{
    protected GrassWhistle(){
        super(Type.GRASS, 0, 55);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().turns(3);
        p.setCondition(e);
        Effect.sleep(p);
    }
    @Override
    protected String describe(){
        return "Накладывает эффект сна на протинвинка на три хода";
    }
}

class XScissor extends PhysicalMove{
    protected XScissor(){
        super(Type.BUG, 80, 100);
    }
}

/*
class Facade extends PhysicalMove{
    protected Facade(){
        super(Type.NORMAL, 70, 100);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        Status k = def.getCondition();
        if (k.equals(Status.BURN) || k.equals(Status.POISON) || k.equals(Status.PARALYZE)){
            def.setMod(Stat.HP, (int) Math.round(damage)*2);
        }
    }
}

class Swagger extends StatusMove{
    protected Swagger() {
        super(Type.NORMAL, 0, 85);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, 2);
        Effect.confuse(p);
    }
}

class FouPlay extends PhysicalMove{
    protected FouPlay() {
        super(Type.DARK, 95, 100);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        def.setMod(Stat.HP, (int) def.getStat(Stat.ATTACK));
    }
}*/
