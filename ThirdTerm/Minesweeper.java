//Eric Guan, Period 3
import java.util.*;
import javax.swing.JOptionPane;
public class Minesweeper
{
   public static void main (String [] args)
   {
      int size = welcomeAndAskForSizeOfField();
      int [][] minesfield = new int[size][size];
      char [][] outputField = new char[size][size];
   
      init(minesfield, outputField);
      displayBombs(minesfield);
      System.out.println();
      displayOutput(outputField);
   
      boolean gameOver = false;
      while(gameOver != true)
      {
         gameOver = playGame(minesfield, outputField);
         displayOutput(outputField);
      }
      System.out.println();
      displayBombs(minesfield);
   }
   public static int welcomeAndAskForSizeOfField()
   {
      Scanner console = new Scanner(System.in);
      int size = console.nextInt();
      return size;
   }
   public static void init (int [] [] mines, char [] [] output)
   {
      for (int r = 0; r < output.length; r++)
      {
         for (int c = 0; c < output[0].length; c++)
            output[r][c] = ' ';
      }
         // generate a random mine field
      for (int r = 0; r <  mines.length; r++)
      {
         for (int c = 0; c < mines[0].length; c++)
            mines[r][c] = (int)(Math.random() * 2);
      }
   }
   public static void displayOutput (char [] [] output)
   {
      for (int r = 0; r < output.length; r++)
      {
         for (int c = 0; c < output[0].length; c++)
            System.out.print ("[" + (char)output[r][c] + "]");
         System.out.println();
      } 
   }
   public static int countmines(int [][] mines, int r, int c)
   {
      int rMin = r-1;
      int rMax = r+1;
      int cMin = c-1;
      int cMax = c+1;
      int count = 0;
      if(r == 0)
         rMin = 0;
      if(r == mines.length-1)
         rMax = mines.length-1;
      if(c == 0)
         cMin = 0;
      if(c == mines.length-1)
         cMax = mines.length-1;
      for(int i = rMin;i<= rMax; i++)
      {
         for(int j = cMin;j<=cMax;j++)
         {
            if(mines[i][j] == 1 && (i != r || j!= c))
               count++;
         }
      }
      return count;
   }
   public static boolean playGame(int [][] mines, char [][] outputBoard)
   {
      Scanner console = new Scanner(System.in);
      while (true)
      {
         int a = console.nextInt();
         int b = console.nextInt();
         if(mines[a][b] == 1)
         {
            outputBoard[a][b] = 'x';
            System.out.println("You have lost");
            displayBombs(mines);
            return true;
         }
         else
         {
            int c = countmines(mines, a, b);
            outputBoard [a][b] = (c + "").charAt(0);
            displayOutput(outputBoard);
            if(checkStatus(mines, outputBoard) == true)
            {
               System.out.println("You have won!");
               break;
            }
         }
      } // while
      return true;
   }
   private static boolean checkStatus (int [][] mines, char [][] output)
   {
      boolean check = false;
      for(int k = 0;k<mines.length;k++)
      {
         for(int j = 0;j<mines[0].length;j++)
         {
            if(mines[k][j] == 0)
            {
               if(output[k][j] != ' ')
               {
                  check = true;
               }
               else
                  check = false;
            }
         }
      }
      return check;
   }
   public static void displayBombs(int [][] a)
   {
      for (int r = 0; r < a.length; r++)
      {
         for (int c = 0; c < a[0].length; c++)
            System.out.print ("[" + (a[r][c] + "").charAt(0) + "]");
         System.out.println();
      } 
   }
 

}

/***
----jGRASP exec: java Minesweeper
 
 3
 [1][1][0]
 [0][1][1]
 [1][1][1]
 
 [ ][ ][ ]
 [ ][ ][ ]
 [ ][ ][ ]
 0
 2
 [ ][ ][3]
 [ ][ ][ ]
 [ ][ ][ ]
 1
 0
 [ ][ ][3]
 [5][ ][ ]
 [ ][ ][ ]
 You have won!
 [ ][ ][3]
 [5][ ][ ]
 [ ][ ][ ]
 [1][1][0]
 [0][1][1]
 [1][1][1]
 
  ----jGRASP: operation complete.
   ----jGRASP exec: java Minesweeper
 
 4
 [1][1][0][0]
 [1][1][1][0]
 [1][0][0][0]
 [1][1][1][1]
 
 [ ][ ][ ][ ]
 [ ][ ][ ][ ]
 [ ][ ][ ][ ]
 [ ][ ][ ][ ]
 0
 2
 [ ][ ][3][ ]
 [ ][ ][ ][ ]
 [ ][ ][ ][ ]
 [ ][ ][ ][ ]
 0
 1
 You have lost
 [1][1][0][0]
 [1][1][1][0]
 [1][0][0][0]
 [1][1][1][1]
 [ ][x][3][ ]
 [ ][ ][ ][ ]
 [ ][ ][ ][ ]
 [ ][ ][ ][ ]
 
 [1][1][0][0]
 [1][1][1][0]
 [1][0][0][0]
 [1][1][1][1]
 
  ----jGRASP: operation complete.
***/