package org.jscode.prototype;

public class Warrior extends Enemy{

    private int endurence;

    public Warrior(int health, int damage, int endurence) {
        super(health, damage);
        this.endurence = endurence;
    }

    public Warrior(Warrior warrior) {
        super(warrior);
        if(warrior != null){
            setEndurence(warrior.getEndurence());
        }
    }

    public Warrior(Enemy enemy, int endurence) {
        super(enemy);
        this.endurence = endurence;
    }

    @Override
    public Enemy clone() {
        return new Warrior(this);
    }

    public int getEndurence() {
        return endurence;
    }

    public Warrior setEndurence(int endurence) {
        this.endurence = endurence;
        return this;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "endurence=" + endurence +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }



}
