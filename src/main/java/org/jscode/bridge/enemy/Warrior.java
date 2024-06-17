package org.jscode.bridge.enemy;

import org.jscode.bridge.fighter.Fighter;
import org.jscode.bridge.fighter.WarriorFighterImpl;

public class Warrior extends Enemy {


    public Warrior() {
        setFighter(new WarriorFighterImpl());
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public Enemy setHealth(int health) {
        return super.setHealth(health);
    }

    public void attack() {
        System.out.println("Warrior: ");
        getFighter().attack();
    }

    public void protect() {
        System.out.println("Warrior: ");
        getFighter().protect();
    }

    @Override
    public Fighter getFighter() {
        return super.getFighter();
    }

    @Override
    public Enemy setFighter(Fighter fighter) {
        return super.setFighter(fighter);
    }
}
