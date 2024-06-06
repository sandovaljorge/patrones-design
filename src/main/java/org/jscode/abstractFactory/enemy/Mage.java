package org.jscode.abstractFactory.enemy;

public class Mage implements Enemy {
    @Override
    public void attack() {
        System.out.println("Mage Attack!!!");
    }
}
