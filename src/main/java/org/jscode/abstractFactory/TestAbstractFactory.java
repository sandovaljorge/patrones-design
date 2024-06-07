package org.jscode.abstractFactory;

import org.jscode.abstractFactory.armor.Armor;
import org.jscode.abstractFactory.factory.EnemyAbstractFactory;
import org.jscode.abstractFactory.factory.MageFactory;
import org.jscode.abstractFactory.factory.WarriorFactory;
import org.jscode.abstractFactory.weapon.Weapon;
import org.jscode.factoryMethod.Enemy;

public class TestAbstractFactory {

    public static void main(String[] args) {
        EnemyAbstractFactory factory = new WarriorFactory();
        org.jscode.factory.Enemy warrior = factory.createEnemy();
        Armor heavyArmor = factory.createArmor();
        Weapon axe = factory.createWeapon();

        warrior.attack();
        heavyArmor.protect();
        axe.damage();

        factory = new MageFactory();
        org.jscode.factory.Enemy mage = factory.createEnemy();
        Armor robe = factory.createArmor();
        Weapon wizardStaff = factory.createWeapon();

        mage.attack();
        robe.protect();
        wizardStaff.damage();
    }
}
