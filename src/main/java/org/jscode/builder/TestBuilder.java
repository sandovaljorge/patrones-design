package org.jscode.builder;

public class TestBuilder {

    public static void main(String[] args) {
        Enemy e = Enemy.builder()
                .name("mage_name")
                .type("mage")
                .health(100)
                .damage(200)
                .endurance(300)
                .build();

        System.out.println(e.toString());
    }
}
