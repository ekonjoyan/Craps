
/**
 * Write a description of class Craps here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Craps
{

   public static boolean playGame() {
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
        System.out.print("Would you like instructions? (Y/n)?");
        String playGame = in.nextLine();
        if (playGame.substring(0,1).equalsIgnoreCase("y"))
        { 
            System.out.println("1. A player rolls two six-sided dice and adds the numbers rolled together.");
            System.out.println("2. On this first roll, a 7 or an 11 automatically wins, and a 2, 3, or 12 automatically loses,and play isover. If a 4, 5, 6, 8, 9, or 10 are rolled on first roll, that number becomes the 'point.' ");
            System.out.println("3. The player continues to roll the two diceagain until one of two things happens: either they roll the 'point' from that first roll again, in which case they win; orthey roll a 7, in which case they lose");
        }
    }
   public static int pointOne() {
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
   public static void calc(int point1, int point2, boolean exit) {
       if ((point1 == 7 || point1 ==11) && point2 == 0 ) {
           System.out.println("YOU WIN!");
           exit = true;
        }
       else if ((point1 == 2 || point1 == 3 || point1 == 12) && point2 == 0) {
           System.out.println("YOU LOSE.");
           exit = true;
        }
       else if (point1 == point2) {
           System.out.println("YOU WIN!");
           exit = true;
        }
       else if (point2 == 7) {
           System.out.println("YOU LOSE.");
           exit = true;
        }
   }
    
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean exit = false;
        playGame();
        while(playGame() == true) {
        instructions();
        pointOne();
        int point1 = pointOne();
        calc(point1, 0, exit);
        while (exit ==false) {
         int point2 = pointTwo();
         calc(point1, point2 , exit);
        }
        playGame();
    }
    }

}
