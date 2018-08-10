public class Player {
    public int health;
    public int damage;
    public int killCount;

    public String displayHealth() {
        return "Health: " + String.valueOf(this.health); 
    }

    public String displayDamage() {
        return "Damage: " + String.valueOf(this.damage);
    }

    public void setHealth() {
        if(this instanceof Warrior) {
            health = 60;
        } else if (this instanceof Mage) {
            health = 35;
        } else if (this instanceof Ranger) {
            health = 45;
        } else {
            System.out.println("Error: setHealth method must take in an instance of either Mage, Warrior, or Ranger");
        }
    }

    public void setDamage() {
        if(this instanceof Warrior) {
            damage = 20;
        } else if (this instanceof Mage) {
            damage = 30;
        } else if (this instanceof Ranger) {
            damage = 25;
        } else {
            System.out.println("Error: setDamage method must take in an instance of either Mage, Warrior, or Ranger");
        }
    }

    public static Player createPlayer(String type) {
        if(type.equals("mage") || type.equals("Mage") || type.equals("MAGE")) {
            Mage mage = new Mage();
            return mage;
        } else if (type == "warrior" || type == "Warrior" || type == "WARRIOR") {
            Warrior warrior = new Warrior();
            return warrior;
        } else if (type == "ranger" || type == "Ranger" || type == "RANGER") {
            Ranger ranger = new Ranger();
            return ranger;
        } else {
            System.out.println("Invalid class name");
            return null;
        }
    }
}