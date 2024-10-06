

public class Character{

    private String build;
    private int attack;
    private int defense;
    private int health;
    private int stealth;

    public Character(String build, int health, int attack, int defense, int stealth){
        this.build = build;
        this.attack = attack;
        this.defense = defense;
        this.health = health;
        this.stealth = stealth;

    }

    public void displayStats(){
        System.out.println("Your build is: " + build);
        System.out.println("Health: " + health);
        System.out.println("Attack:  " + attack);
        System.out.println("Defense: " + defense);
        System.out.println("Stealth: " + stealth);
        System.out.println("\n\n");

    }

    public void isThisWorking(){
        System.out.println("This is working!");
    }

    public void newHealth(int health){
        this.health = health;
    }

    public void newAttack(int attack){
        this.attack = attack;
    }

    public void newDefense(int defense){
        this.defense = defense;
    }

    public void newStealth(int stealth){
        this.stealth = stealth;
    }
}
