package kg.geektech.lesson8_1.players;

public class Hunter extends Hero implements HavingSuperPower {



    public Hunter(int health, int damage) {
        super(health, damage, AbilityType.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
      heroes[3].setDamage(heroes[3].getDamage()+boss.getDamage());
        System.out.println("Урон Хантера увеличено на "+heroes[3].getDamage());
    }
}
