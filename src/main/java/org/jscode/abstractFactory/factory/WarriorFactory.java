package org.jscode.abstractFactory.factory;

import org.jscode.abstractFactory.armor.Armor;
import org.jscode.abstractFactory.armor.HeavyArmor;
import org.jscode.abstractFactory.weapon.Axe;
import org.jscode.abstractFactory.weapon.Weapon;
import org.jscode.factory.Enemy;
import org.jscode.factory.Warrior;

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
