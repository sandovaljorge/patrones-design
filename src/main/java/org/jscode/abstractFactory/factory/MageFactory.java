package org.jscode.abstractFactory.factory;

import org.jscode.abstractFactory.armor.Armor;
import org.jscode.abstractFactory.armor.Robe;
import org.jscode.abstractFactory.weapon.Weapon;
import org.jscode.abstractFactory.weapon.WizardStaff;
import org.jscode.factory.Enemy;
import org.jscode.factory.Mage;

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
