
/**
 * The Craps program.
 * The Craps program simuates the playing of the game craps.
 *
 * @author Eddie Konjoyan
 * @version 2/6/2021
 */
import java.util.Scanner;
public class Craps
{
    /*
     * 
     * 
     */
   public static boolean playGame() {
        Scanner in = new Scanner(System.in);
        System.out.print("Would you like to play Craps (Y/n)?");
        String playGame = in.nextLine();
        if (playGame.substring(0,1).equalsIgnoreCase("y"))
        { 
            return true;
        }
        else {
            return false;
        }
    }
    
   public static void instructions() {
        Scanner in = new Scanner(System.in);
        System.out.print("Would you like instructions? (Y/n)?");
        String playGame = in.nextLine();
        if (playGame.substring(0,1).equalsIgnoreCase("y"))
        { 
            System.out.println("1. A player rolls two six-sided dice and adds the numbers rolled together.");
            System.out.println("2. On this first roll, a 7 or an 11 automatically wins, and a 2, 3, or 12 automatically loses,and play is over.");
            System.out.println("   If a 4, 5, 6, 8, 9, or 10 are rolled on first roll, that number becomes the 'point.' ");
            System.out.println("3. The player continues to roll the two dice again until one of two things happens: either they roll the 'point' from that first roll again,");
            System.out.println("   in which case they win; or they roll a 7, in which case they lose");
        }
    }
   public static int pointOne() {
       Scanner in = new Scanner(System.in);
       Die die1 = new Die();
       System.out.print("Press <Enter> to roll...");
       String pause = in.nextLine();
       int firstRoll = die1.roll();
       System.out.println(firstRoll);
       System.out.print("Press <Enter> to roll...");
       String pause2 = in.nextLine();
       int secondRoll = die1.roll();
       System.out.println(secondRoll);
       int point = firstRoll + secondRoll;
       System.out.println("Your first total is " + point);
       return point;
       
    }
   public static int pointTwo() {
       Scanner in = new Scanner(System.in);
       Die die1 = new Die();
       System.out.print("Press <Enter> to roll...");
       String pause = in.nextLine();
       int firstRoll = die1.roll();
       System.out.println(firstRoll);
       System.out.print("Press <Enter> to roll...");
       String pause2 = in.nextLine();
       int secondRoll = die1.roll();
       System.out.println(secondRoll);
       int point2 = firstRoll + secondRoll;
       System.out.println("Your second total is " + point2);
       return point2;
    }
   public static boolean calc(int point1, int point2) {
       if ((point1 == 7 || point1 ==11) && point2 == 0 ) {
           System.out.println("YOU WIN!");
           return true;
        }
       else if ((point1 == 2 || point1 == 3 || point1 == 12) && point2 == 0) {
           System.out.println("YOU LOSE.");
           return true;
        }
       else if (point1 == point2) {
           System.out.println("YOU WIN!");
           return true;
        }
       else if (point2 == 7) {
           System.out.println("YOU LOSE.");
           return true;
        }
        return false;
   }
    
   public static void main(String[] args) {
        boolean exit = false;
        while(playGame() == true) {
        instructions();
        int point1 = pointOne();
        exit = calc(point1, 0);
        while (exit == false) {
         int point2 = pointTwo();
         exit = calc(point1, point2);
        }
    }
    System.out.println("Thanks for playing!");
   }
}