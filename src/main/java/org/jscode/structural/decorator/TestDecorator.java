package org.jscode.structural.decorator;

import org.jscode.structural.decorator.race.Elf;
import org.jscode.structural.decorator.race.Human;

public class TestDecorator {

    public static void main(String[] args) {
        System.out.println("______________________ HUMAN WARRIOR ______________________");
        Enemy humanWarrior = new WarriorEnemyDecorator(new Human());
        humanWarrior.attack();


        System.out.println("______________________ HUMAN WARRIOR MAGE  ______________________");
        Enemy humanWarriorMage = new WarriorEnemyDecorator(new MageEnemyDecorator(new Human()));
        humanWarriorMage.attack();

        System.out.println("______________________ ELF WARRIOR MAGE ASSASSIN ______________________");
        Enemy elfWarriorMageAssassin = new AssassinEnemyDecorator(new MageEnemyDecorator(new WarriorEnemyDecorator(new Elf())));
        elfWarriorMageAssassin.attack();

    }
}
