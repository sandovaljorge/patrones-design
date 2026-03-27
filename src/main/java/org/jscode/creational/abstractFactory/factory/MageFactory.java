package org.jscode.creational.abstractFactory.factory;

import org.jscode.creational.abstractFactory.armor.Armor;
import org.jscode.creational.abstractFactory.armor.Robe;
import org.jscode.creational.abstractFactory.weapon.Weapon;
import org.jscode.creational.abstractFactory.weapon.WizardStaff;
import org.jscode.creational.factory.Enemy;
import org.jscode.creational.factory.Mage;

public class MageFactory extends EnemyAbstractFactory{
    @Override
    public Enemy createEnemy() {
        return new Mage();
    }

    @Override
    public Armor createArmor() {
        return new Robe();
    }

    @Override
    public Weapon createWeapon() {
        return new WizardStaff();
    }
}
