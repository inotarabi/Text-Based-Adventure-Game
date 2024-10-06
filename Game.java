
import java.util.Scanner;

public class Game{
    public static void main(String[] args){

        Scanner expandBuildInput = new Scanner(System.in);
        System.out.println("Type each number to expand on each build \n 1. Assassain \n 2. Knight \n 3. Mage \n 4. Healer");
        int expandBuild = expandBuildInput.nextInt();


        if (expandBuild == 1){
            Assassin.displayBuildStats();
        } else if (expandBuild == 2){
            Knight.displayBuildStats();
        } else if (expandBuild == 3){
            Mage.displayBuildStats();
        } else if (expandBuild == 4){
            Healer.displayBuildStats();
        }

        Scanner confirmBuild = new Scanner(System.in);
        System.out.println("\n1. Confirm Build \n2. Go Back");



    }

    static void expandBuildInput(){
        
    }

}