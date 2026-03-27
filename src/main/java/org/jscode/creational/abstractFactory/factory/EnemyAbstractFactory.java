package org.jscode.creational.abstractFactory.factory;

import org.jscode.creational.abstractFactory.armor.Armor;
import org.jscode.creational.abstractFactory.weapon.Weapon;
import org.jscode.creational.factory.Enemy;

public abstract class EnemyAbstractFactory {

    public abstract Enemy createEnemy();
    public abstract Armor createArmor();
    public abstract Weapon createWeapon();
}
