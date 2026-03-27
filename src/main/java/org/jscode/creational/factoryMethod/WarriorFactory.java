package org.jscode.creational.factoryMethod;

public class WarriorFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new Warrior();
    }
}
