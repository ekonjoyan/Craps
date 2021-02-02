
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
            return false;d
        }
    }
    public static void instructions() {
        System.out.print("Would you like instructions? (Y/n)?");
        String playGame = in.nextLine();
        if (playGame.substring(0,1).equalsIgnoreCase("y"))
        { 
           System.out.println("1. A player rolls two six-sided dice and adds the numbers 
           rolled together.");
           System.out.println("2. On this first roll, a 7 or an 11 automatically wins, and a 2, 3, or 12 automatically loses, and play is
over. If a 4, 5, 6, 8, 9, or 10 are rolled on this first roll, that number becomes the "point.”
3. The player continues to roll the two dice again until one of two things happens: either they roll the
"point" from that first roll again, in which case they win; or they roll a 7, in which case they lose
        }
        
    }
    
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    }
   
}
