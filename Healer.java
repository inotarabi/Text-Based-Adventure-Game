public class Healer extends Character{

    private static int health = 30;
    private static int attack = 15;
    private static int defense = 30;
    private static int stealth = 25;

    public Healer(){
        super("Healer ",health, attack, defense, stealth);
    }

    public static void displayBuildStats(){
        System.out.println("Health: " + health);
        System.out.println("Attack: " + attack);
        System.out.println("Defense: " + defense);
        System.out.println("Stealth: " + stealth);
    }
}
