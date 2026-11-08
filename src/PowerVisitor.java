public class PowerVisitor implements CharacterVisitor {
    @Override
    public void visitWarrior(Warrior warrior) {
        int power = warrior.getStrength() * 2 + warrior.getDefense();
        System.out.println(warrior.getName() + " power: " + power);
    }
    @Override
    public void visitMage(Mage mage) {
        int power = mage.getMagicPower() * 3 + mage.getMana() / 2;
        System.out.println(mage.getName() + " power: " + power);
    }
}
