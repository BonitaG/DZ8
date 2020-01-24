package kg.geektech.lesson8_1.players;

import java.util.Random;

public class Magic extends Hero {

    public Magic(int health, int damage) {
        super(health, damage, AbilityType.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getDamage() > 0) {
                heroes[i].setDamage(heroes[i].getDamage() + 20);
                System.out.println(" Атака героев увеличено "+ heroes[i].getClass().getSimpleName() + " " + 20);
            }
        }

    }
}
