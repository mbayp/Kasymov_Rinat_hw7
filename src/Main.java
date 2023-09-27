public class Main {
    public static void main(String[] args) {

        Hero[] heroes = {
                new Magic(100, 20),
                new Medic(120, 15),
                new Warrior(150, 30)
        };


        for (Hero hero : heroes) {
            hero.applySuperAbility();
        }
    }
}