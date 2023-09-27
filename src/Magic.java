class Magic extends Hero {
    public Magic(int health, int damage) {
        super(health, damage, "Magic Super Ability");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил суперспособность " + superAbilityType);
    }
}