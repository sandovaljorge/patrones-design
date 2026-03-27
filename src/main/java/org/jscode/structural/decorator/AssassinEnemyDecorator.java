package org.jscode.structural.decorator;

public class AssassinEnemyDecorator extends EnemyDecorator{


    public AssassinEnemyDecorator(Enemy enemy) {
        super(enemy);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Assassins attack!!!");
    }
}
