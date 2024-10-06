public class Assassin extends Character{

    private static int health = 30;
    private static int attack = 20;
    private static int defense = 35;
    private static int stealth = 40;


    public Assassin(){
        super("Assassin",health, attack, defense, stealth);
    }

    public static void displayBuildStats(){
        System.out.println("Health: " + health);
        System.out.println("Attack: " + attack);
        System.out.println("Defense: " + defense);
        System.out.println("Stealth: " + stealth);
    }

}
