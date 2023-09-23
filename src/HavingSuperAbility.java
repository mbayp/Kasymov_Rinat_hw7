interface HavingSuperAbility {
    void applySuperAbility();
}

// Создаем абстрактный класс Hero, который реализует интерфейс HavingSuperAbility
abstract class Hero implements HavingSuperAbility {
    protected int health;
    protected int damage;
    protected String superAbilityType;

    public Hero(int health, int damage, String superAbilityType) {
        this.health = health;
        this.damage = damage;
        this.superAbilityType = superAbilityType;
    }
}

// Создаем класс Magic, наследующийся от Hero
class Magic extends Hero {
    public Magic(int health, int damage) {
        super(health, damage, "Magic Super Ability");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил суперспособность " + superAbilityType);
    }
}

// Создаем класс Medic, наследующийся от Hero
class Medic extends Hero {
    public Medic(int health, int damage) {
        super(health, damage, "Medic Super Ability");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность " + superAbilityType);
    }
}

// Создаем класс Warrior, наследующийся от Hero
class Warrior extends Hero {
    public Warrior(int health, int damage) {
        super(health, damage, "Warrior Super Ability");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил суперспособность " + superAbilityType);
    }
}
