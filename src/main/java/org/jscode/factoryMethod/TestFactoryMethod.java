package org.jscode.factoryMethod;

import org.jscode.factoryMethod.Enemy;

public class TestFactoryMethod {

    public static void main(String[] args) {
        Enemy warrior = new WarriorFactory().createEnemy();
        Enemy mage = new MageFactory().createEnemy();
        warrior.attack();
        mage.attack();
    }
}
