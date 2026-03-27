package org.jscode.structural.decorator.race;

import org.jscode.structural.decorator.Enemy;

public class Elf implements Enemy {

    @Override
    public void attack() {
        System.out.println("Elf attack!!");
    }
}
