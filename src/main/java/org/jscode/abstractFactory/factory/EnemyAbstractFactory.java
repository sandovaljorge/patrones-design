package org.jscode.abstractFactory.factory;

import org.jscode.abstractFactory.armor.Armor;
import org.jscode.abstractFactory.weapon.Weapon;
import org.jscode.factory.Enemy;

public abstract class EnemyAbstractFactory {

    public abstract Enemy createEnemy();
    public abstract Armor createArmor();
    public abstract Weapon createWeapon();
}
