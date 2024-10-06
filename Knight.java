public class Knight extends Character{

    private static int health = 30;
    private static int attack = 40;
    private static int defense = 30;
    private static int stealth = 10;

    public Knight(){
        super("Knight",health, attack, defense, stealth);
    }

    public static void displayBuildStats(){

        System.out.println("Health: " + health);
        System.out.println("Attack: " + attack);
        System.out.println("Defense: " + defense);
        System.out.println("Stealth: " + stealth);
    }
}
