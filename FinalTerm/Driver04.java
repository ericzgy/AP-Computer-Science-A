import javax.swing.*;

public class Driver04
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Hello Button");
      frame.setSize(200, 100);
      frame.setLocation(200, 100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new Panel04());
      frame.setVisible(true);
   }
}