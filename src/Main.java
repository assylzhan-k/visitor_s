import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<GameCharacter> characters = Arrays.asList(
                new Warrior("Diluc", 40, 20),
                new Mage("Lisa", 35, 60));
        CharacterVisitor powerVisitor = new PowerVisitor();
        CharacterVisitor infoVisitor = new InfoVisitor();
        System.out.println("=== Character Information ===");
        for (GameCharacter character : characters) {
            character.accept(infoVisitor);
        }
        System.out.println("=== Character Power ===");
        for (GameCharacter character : characters) {
            character.accept(powerVisitor);
        }
    }
}
