package org.jscode.structural.composite;

public class TestComposite {

    public static void main(String[] args) {
        BaseItem inventario = new Bag("inventario");
        BaseItem bagCoins = new Bag("bag coins");
        BaseItem bagPotions = new Bag("bag potions");

        BaseItem coins = new Item("coins", 3);
        bagCoins.add(coins);

        BaseItem magicPotion = new Item("magic potion", 3);
        BaseItem healthPotion = new Item("health potion", 3);
        bagPotions.add(magicPotion);
        bagPotions.add(healthPotion);

        BaseItem blade = new Item("blade", 3);
        BaseItem shield = new Item("shield", 3);
        BaseItem armor = new Item("armor", 3);

        inventario.add(bagCoins);
        inventario.add(bagPotions);
        inventario.add(blade);
        inventario.add(shield);
        inventario.add(armor);

        System.out.println("Inventario total value: " + inventario.getValue());

        inventario.delete(blade);

        System.out.println("Inventario total value: " + inventario.getValue());

    }
}
