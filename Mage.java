public class Mage extends Player {

    public Mage() {
        this.setHealth();
        this.setDamage();
    }

    public void healSelf() {
        this.health += 25;
    }

    public void fireball(NPC npc) {
        npc.health -= 60;
    }
}