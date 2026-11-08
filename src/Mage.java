public class Mage implements GameCharacter {
    private final String name;
    private final int magicPower;
    private final int mana;
    public Mage(String name, int magicPower, int mana) {
        this.name = name;
        this.magicPower = magicPower;
        this.mana = mana;
    }
    public String getName() {
        return name;
    }
    public int getMagicPower() {
        return magicPower;
    }
    public int getMana() {
        return mana;
    }
    @Override
    public void accept(CharacterVisitor visitor) {
        visitor.visitMage(this);
    }
}
