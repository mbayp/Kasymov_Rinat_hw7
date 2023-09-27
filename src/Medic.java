class Medic extends Hero {
    public Medic(int health, int damage) {
        super(health, damage, "Medic Super Ability");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность " + superAbilityType);
    }
}