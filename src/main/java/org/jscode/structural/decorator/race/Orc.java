package org.jscode.structural.decorator.race;

import org.jscode.structural.decorator.Enemy;

public class Orc implements Enemy {

    @Override
    public void attack() {
        System.out.println("orc attack!!");
    }
}
