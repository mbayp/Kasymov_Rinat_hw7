class Warrior extends Hero {
    public Warrior(int health, int damage) {
        super(health, damage, "Warrior Super Ability");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил суперспособность " + superAbilityType);
    }
}