package org.jscode.creational.abstractFactory;

import org.jscode.creational.abstractFactory.armor.Armor;
import org.jscode.creational.abstractFactory.factory.EnemyAbstractFactory;
import org.jscode.creational.abstractFactory.factory.MageFactory;
import org.jscode.creational.abstractFactory.factory.WarriorFactory;
import org.jscode.creational.abstractFactory.weapon.Weapon;
import org.jscode.creational.factory.Enemy;

public class TestAbstractFactory {

    public static void main(String[] args) {
        EnemyAbstractFactory factory = new WarriorFactory();
        Enemy warrior = factory.createEnemy();
        Armor heavyA.rmor = factory.createArmor();
        Weapon axe = factory.createWeapon();

        warrior.attack();
        heavyArmor.protect();
        axe.damage();

        factory = new MageFactory();
        Enemy mage = factory.createEnemy();
        Armor robe = factory.createArmor();
        Weapon wizardStaff = factory.createWeapon();

        mage.attack();
        robe.protect();
        wizardStaff.damage();
    }
}
