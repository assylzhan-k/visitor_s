public class InfoVisitor implements CharacterVisitor {
    @Override
    public void visitWarrior(Warrior warrior) {
        System.out.println("Warrior: " + warrior.getName() + ", Strength: " + warrior.getStrength()
                        + ", Defense: " + warrior.getDefense());
    }
    @Override
    public void visitMage(Mage mage) {
        System.out.println("Mage: " + mage.getName() + ", Magic Power: " + mage.getMagicPower()
                        + ", Mana: " + mage.getMana());
    }
}
