public class Skeleton extends NPC {
    public Skeleton() {
        this.health = 60;
        this.damage = 30;
    }

    public void attackPlayer(Player player) {
        player.health -= this.damage;
    }
}