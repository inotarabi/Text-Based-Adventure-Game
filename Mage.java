public class Mage extends Character{

    private static int health = 30;
    private static int attack = 15;
    private static int defense = 40;
    private static int stealth = 20;

    public Mage(){
        super("Mage",health, attack, defense, stealth);
    }

    public static void displayBuildStats(){
        System.out.println("Health: " + health);
        System.out.println("Attack: " + attack);
        System.out.println("Defense: " + defense);
        System.out.println("Stealth: " + stealth);
    }
}
