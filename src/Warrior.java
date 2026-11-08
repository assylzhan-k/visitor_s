public class Warrior implements GameCharacter {
    private final String name;
    private final int strength;
    private final int defense;
    public Warrior(String name, int strength, int defense) {
        this.name = name;
        this.strength = strength;
        this.defense = defense;
    }
    public String getName() {
        return name;
    }
    public int getStrength() {
        return strength;
    }
    public int getDefense() {
        return defense;
    }
    @Override
    public void accept(CharacterVisitor visitor) {
        visitor.visitWarrior(this);
    }
}
