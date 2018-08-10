import java.util.Scanner;

public class WorldInitializer {

    public static String createGame() {
        System.out.println("Welcome to the game! Please choose your character class:");
        System.out.println("Mage - Warrior - Ranger");
        Scanner scanner = new Scanner(System.in);
        String classString = scanner.next();
        classString = classString.replaceAll("[^a-z]","");
        return classString;
    }

}