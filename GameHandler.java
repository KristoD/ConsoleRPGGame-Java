public class GameHandler {
    public static void main(String[] args) {
        String type = WorldInitializer.createGame();
        if(type.equals("mage") || type.equals("Mage") || type.equals("MAGE")) {
            Mage player = new Mage();
            System.out.println(player.displayDamage());
            System.out.println(player.displayHealth());
            Dungeon dungeon = new Dungeon();
            dungeon.startingDungeon(player);
        }
    }
}