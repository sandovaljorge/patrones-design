package org.jscode.creational.abstractFactory.factory;

import org.jscode.creational.abstractFactory.armor.Armor;
import org.jscode.creational.abstractFactory.armor.HeavyArmor;
import org.jscode.creational.abstractFactory.weapon.Axe;
import org.jscode.creational.abstractFactory.weapon.Weapon;
import org.jscode.creational.factory.Enemy;
import org.jscode.creational.factory.Warrior;

public class WarriorFactory extends EnemyAbstractFactory{
    @Override
    public Enemy createEnemy() {
        return new Warrior();
    }

    @Override
    public Armor createArmor() {
        return new HeavyArmor();
    }

    @Override
    public Weapon createWeapon() {
        return new Axe();
    }
}
