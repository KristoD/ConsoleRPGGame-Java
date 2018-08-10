import java.util.ArrayList;
import java.util.Scanner;

public class Dungeon {

    private static int npcCount;
    public Skeleton skeleton;

    public void startingDungeon(Mage player) {
        System.out.println("You wake up in a dungeon. You see two doors, one to your left and right.");
        String direction = chooseDirection();
        initializeDungeon(direction, player);
    }

    public String chooseDirection() {
        System.out.println("Which door will you go to?");
        System.out.println("Left - Right");
        Scanner scanner = new Scanner(System.in);
        String direction = scanner.next();
        direction = direction.replaceAll("[^a-z]", "");
        direction = direction.toLowerCase();
        if(!direction.equals("left") && !direction.equals("right") && !direction.equals("forward")) {
            System.out.println("Must type left or right!");
            chooseDirection();
        }
        return direction;
    }

    // I have to make three initializeDungeon methods which each takes its own parameter type of Mage, Warrior, or Ranger
    // !!!!! ^^^^^^^^ !!!!!!!!

    public void initializeDungeon(String direction, Mage player) {
        if(direction.equals("left")) {
            if (skeleton.health > 0) {
                System.out.println("You have entered a room with a skeleton!");
                System.out.println("The skeleton throws a bone at you. You are damaged for 30 health");
                skeleton.attackPlayer(player);
                player.healSelf();
                player.fireball(skeleton);
                System.out.println("You heal yourself and cast a fireball at the Skeleton!");
                System.out.println("The skeleton dies!");
                System.out.println(skeleton.health);
            } else {
                leftDungeon();
                initializeDungeon(direction, player);
            }
        } else if (direction.equals("right")) {
            System.out.println("You have entered a room with a dragon!");
            NPC dragon = rightDungeon();
            System.out.println(dragon.health);
        } else {
            chooseDirection();
        }
    }

    public Skeleton leftDungeon() {
        skeleton = new Skeleton();
        npcCount++;
        return skeleton;
    }

    public Dragon rightDungeon() {
        Dragon dragon = new Dragon();
        npcCount++;
        return dragon;
    }

}