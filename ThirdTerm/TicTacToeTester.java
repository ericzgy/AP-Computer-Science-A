//Eric Guan, Period 3
import javax.swing.JOptionPane;

public class TicTacToeTester
{
   public static void main (String [] args)
   {
      char player = 'x';
      TicTacToe game = new TicTacToe();
      while (true)
      {
         System.out.println (game);
         if(game.getWinner())
            break;
         String input = JOptionPane.showInputDialog ("Row for " +
                        player + " (from 0-2 and press Cancel to exit)");
         if (input == null) System.exit(0);
      	
         int row = Integer.parseInt (input);
         input = JOptionPane.showInputDialog ("Column for " + player +
                                              " from 0-2 and press Cancel to exit)") ;
         int column = Integer.parseInt (input);
         game.set (row, column, player);
         if (player == 'x')
            player = 'o';
         else
            player = 'x';
      } // while
   }  // main
} // TicTacToeTester
/***

  ----jGRASP exec: java TicTacToeTester
 
 | | | |
 | | | |
 | | | |
 
 |x| | |
 | | | |
 | | | |
 
 |x| | |
 |o| | |
 | | | |
 
 |x|x| |
 |o| | |
 | | | |
 
 |x|x| |
 |o|o| |
 | | | |
 
 |x|x|x|
 |o|o| |
 | | | |
 
 'x' is the winner!
 Thank you for playing
 
  ----jGRASP: operation complete.
   ----jGRASP exec: java TicTacToeTester
 
 | | | |
 | | | |
 | | | |
 
 |x| | |
 | | | |
 | | | |
 
 |x| | |
 | |o| |
 | | | |
 
 |x| | |
 |x|o| |
 | | | |
 
 |x| |o|
 |x|o| |
 | | | |
 
 |x| |o|
 |x|o| |
 |x| | |
 
 'x' is the winner!
 Thank you for playing
 
  ----jGRASP: operation complete.
    ----jGRASP exec: java TicTacToeTester
 
 | | | |
 | | | |
 | | | |
 
 | |x| |
 | | | |
 | | | |
 
 |o|x| |
 | | | |
 | | | |
 
 |o|x| |
 |x| | |
 | | | |
 
 |o|x| |
 |x|o| |
 | | | |
 
 |o|x| |
 |x|o| |
 |x| | |
 
 |o|x| |
 |x|o| |
 |x| |o|
 
 'o' is the winner!
 Thank you for playing
 
  ----jGRASP: operation complete.
      ----jGRASP exec: java TicTacToeTester
 
 | | | |
 | | | |
 | | | |
 
 | | | |
 | | | |
 | |x| |
 
 | | |o|
 | | | |
 | |x| |
 
 | | |o|
 | | | |
 | |x|x|
 
 | | |o|
 | |o| |
 | |x|x|
 
 | | |o|
 |x|o| |
 | |x|x|
 
 | | |o|
 |x|o| |
 |o|x|x|
 
 'o' is the winner!
 Thank you for playing
 
  ----jGRASP: operation complete.
***/