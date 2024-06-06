package org.jscode.abstractFactory.enemy;

public class Warrior implements Enemy {
    @Override
    public void attack() {
        System.out.println("Warrior Attack!!!");
    }
}
