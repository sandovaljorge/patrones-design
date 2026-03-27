package org.jscode.structural.decorator.race;

import org.jscode.structural.decorator.Enemy;

public class Human implements Enemy {
    @Override
    public void attack() {
        System.out.println("human attack!!");
    }
}
