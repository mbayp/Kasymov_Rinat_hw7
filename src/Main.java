public class Main {
    public static void main(String[] args) {
        // Создаем массив из 3 разных героев
        Hero[] heroes = {
                new Magic(100, 20),
                new Medic(120, 15),
                new Warrior(150, 30)
        };

        // Применяем суперспособность каждого героя через цикл
        for (Hero hero : heroes) {
            hero.applySuperAbility();
        }
    }
}