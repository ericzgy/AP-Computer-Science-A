//Eric Guan, Period 3
public class TicTacToe
{
   private char [] [] board;
   private static final int ROWS = 3, COLUMNS = 3;
   public TicTacToe()
   {
      board = new char [ROWS][COLUMNS];
      for (int i = 0; i < ROWS; i++)
      {
         for (int j = 0; j < COLUMNS; j++)
            board[i][j] = ' ';
      }
   }  // default constructor

// post-condition: set a field in the board. The field must be unoccupied
   public void set (int i, int j, char player)
   {
      if (board [i][j] != ' ')
         throw new IllegalArgumentException ("Position occupied");
      board[i][j] = player;
   }  // set

   public String toString()
   {
      String r = "";
      for (int i = 0; i < ROWS; i++)
      {
         r = r + "|";
         for (int j = 0; j < COLUMNS; j++)
         {
            r = r + board[i][j] + "|";
         }
         r = r + "\n";
      }
      return r;
   } // toString
   public boolean getWinner()
   {
      if(board[0][0] == 'x' && board[0][1] == 'x' && board[0][2] == 'x')
      {
         System.out.println("'x' is the winner!");
         System.out.println("Thank you for playing");
         return true;
      }
      else if(board[1][0] == 'x' && board[1][1] == 'x' && board[1][2] == 'x')
      {
         System.out.println("'x' is the winner!");
         System.out.println("Thank you for playing");
         return true;
      }
      else if(board[2][0] == 'x' && board[2][1] == 'x' && board[2][2] == 'x')
      {
         System.out.println("'x' is the winner!");
         System.out.println("Thank you for playing");
         return true;
      }
      else if(board[0][0] == 'x' && board[1][1] == 'x' && board[2][2] == 'x')
      {
         System.out.println("'x' is the winner!");
         System.out.println("Thank you for playing");
         return true;
      }
      else if(board[2][0] == 'x' && board[1][1] == 'x' && board[0][2] == 'x')
      {
         System.out.println("'x' is the winner!");
         System.out.println("Thank you for playing");
         return true;
      }
      else if(board[0][0] == 'x' && board[1][0] == 'x' && board[2][0] == 'x')
      {
         System.out.println("'x' is the winner!");
         System.out.println("Thank you for playing");
         return true;
      }
      else if(board[0][1] == 'x' && board[1][1] == 'x' && board[2][1] == 'x')
      {
         System.out.println("'x' is the winner!");
         System.out.println("Thank you for playing");
         return true;
      }
      else if(board[0][2] == 'x' && board[1][2] == 'x' && board[2][2] == 'x')
      {
         System.out.println("'x' is the winner!");
         System.out.println("Thank you for playing");
         return true;
      }
      if(board[0][0] == 'o' && board[0][1] == 'o' && board[0][2] == 'o')
      {
         System.out.println("'o' is the winner!");
         System.out.println("Thank you for playing");
         return true;
      }
      else if(board[1][0] == 'o' && board[1][1] == 'o' && board[1][2] == 'o')
      {
         System.out.println("'o' is the winner!");
         System.out.println("Thank you for playing");
         return true;
      }
      else if(board[2][0] == 'o' && board[2][1] == 'o' && board[2][2] == 'o')
      {
         System.out.println("'o' is the winner!");
         System.out.println("Thank you for playing");
         return true;
      }
      else if(board[0][0] == 'o' && board[1][1] == 'o' && board[2][2] == 'o')
      {
         System.out.println("'o' is the winner!");
         System.out.println("Thank you for playing");
         return true;
      }
      else if(board[2][0] == 'o' && board[1][1] == 'o' && board[0][2] == 'o')
      {
         System.out.println("'o' is the winner!");
         System.out.println("Thank you for playing");
         return true;
      }
        else if(board[0][2] == 'o' && board[1][2] == 'o' && board[2][2] == 'o')
      {
         System.out.println("'o' is the winner!");
         System.out.println("Thank you for playing");
         return true;
      }
      else if(board[0][1] == 'o' && board[1][1] == 'o' && board[2][1] == 'o')
      {
         System.out.println("'o' is the winner!");
         System.out.println("Thank you for playing");
         return true;
      }
      else if(board[0][0] == 'o' && board[1][0] == 'o' && board[2][0] == 'o')
      {
         System.out.println("'o' is the winner!");
         System.out.println("Thank you for playing");
         return true;
      }
      return false;
   }
}