import javax.swing.JOptionPane.*;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors1
{
   public static void main(String[]args)
   {
           

      new RockPaperScissors1();
     
     
   }
   public RockPaperScissors1()
   {
      
      inputUserChoice();
      chooseAtRandom(); 
      revealPicks(1,"player"); 
      whoWins(1,"player");
   }

   public String chooseAtRandom( )
   // Randomly choose and return ROCK, PAPER or SCISSORS.
   {
     
     Random rps = new Random();
      int pgm = rps.nextInt(3 - 1 + 1) + 1;
      System.out.println(" The program chose " + pgm );
      return "ROCK";
   }

   public String inputUserChoice()
      // Input user's choice of ROCK, PAPER or SCISSORS.
   {
        System.out.println(" Type Rock, Paper, or Scissors");
         Scanner input = new Scanner(System.in);
          String user = input.nextLine();
        System.out.println("you chose " + user);
      return "ROCK"; 
       
   }

   public void revealPicks(int pgm, String user)
         // Display the choices of the program and user.
   {
      System.out.println(" results are " + pgm + " and " + user);           
   }

   public String whoWins(int pgm, String user)
               // Return the winner, either PROGRAM, USER or TIE.
   {
            if (pgm == 3 && user == user)
            return  "pgm"; 
            
            System.out.println(" And the winner is.... " + pgm);
                 return "tie"; 
   }

   public boolean askUserToGoAgain( )
                     // Ask user if he/she wishes to continue the game and,
                     // if so, return true.
   {
                       return true; 
   }
                        
}