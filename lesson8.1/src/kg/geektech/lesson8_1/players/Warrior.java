package kg.geektech.lesson8_1.players;

import java.util.Random;

public class Warrior extends Hero {

    public Warrior(int health, int damage) {
        super(health, damage, AbilityType.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        Random random = new Random();
       int coef= random.nextInt(4);
        boss.setHealth(boss.getHealth() - (coef*10));
        System.out.println(" Нанесен критический удар " + " " + coef*10);
    }

}
