import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel05 extends JPanel
{
   private JButton button1, button2, button3, button4;
   private JPanel panel;

   public Panel05()
   {
      setLayout(new FlowLayout());
      button1 = new JButton("Red");
      button2 = new JButton("Green");
      button3 = new JButton("Blue");
      button4 = new JButton("Gray");
      
      panel = new JPanel(new FlowLayout());
      panel.setBackground(Color.PINK);
      
      panel.add(button1);
      panel.add(button2);
      panel.add(button3);
      panel.add(button4);
      panel.setPreferredSize(new Dimension(800, 650));
      
      button1.addActionListener(new Listener1());
      button2.addActionListener(new Listener2());
      button3.addActionListener(new Listener3());
      button4.addActionListener(new Listener4());

      
      add(panel);
   }
   private class Listener1 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
      panel.setBackground(Color.red);
      }
   }
    private class Listener2 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
      panel.setBackground(Color.green);
      }
   }
    private class Listener3 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
      panel.setBackground(Color.blue);
      }
   }
    private class Listener4 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
      panel.setBackground(Color.gray);
      }
   }
}