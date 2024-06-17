package org.jscode.bridge.enemy;

import org.jscode.bridge.fighter.Fighter;
import org.jscode.bridge.fighter.MageFighterImpl;
import org.jscode.bridge.fighter.WarriorFighterImpl;

public class Mage extends Enemy {


    public Mage() {
        setFighter(new MageFighterImpl());
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
        System.out.println("Mage: ");
        getFighter().attack();
    }

    public void protect() {
        System.out.println("Mage: ");
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
