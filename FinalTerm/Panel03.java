import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel03 extends JPanel
{
   private JPanel eastPanel, southPanel, northPanel;
   private JLabel southLabel;
   private JButton nb1, nb2, nb3, eb1, eb2,eb3;

   public Panel03()
   {
      setLayout(new BorderLayout());
      
      eastPanel = new JPanel(new GridLayout(3,1));
      southPanel = new JPanel(new FlowLayout());
      northPanel = new JPanel(new FlowLayout());
      
      nb1 = new JButton("A");
      nb2 = new JButton("B");
      nb3 = new JButton("C");
      eb1 = new JButton("1");
      eb2 = new JButton("2");
      eb3 = new JButton("3");
      
      
      
      southLabel = new JLabel("What is 2+2?");
      southLabel.setForeground(Color.red);
      southLabel.setFont(new Font("Helvetica", Font.ITALIC, 30));
      southPanel.add(southLabel);
      southLabel.setHorizontalAlignment(SwingConstants.CENTER);
      
      northPanel.add(nb1);
      northPanel.add(nb2);
      northPanel.add(nb3);
      
      eastPanel.add(eb1);
      eastPanel.add(eb2);
      eastPanel.add(eb3);
      
      add(eastPanel, BorderLayout.EAST);
      add(northPanel, BorderLayout.NORTH);
      add(southPanel, BorderLayout.SOUTH);
      
      nb1.addActionListener(new Listener1());
      nb2.addActionListener(new Listener2());
      nb3.addActionListener(new Listener3());
      eb1.addActionListener(new Listener4());
      eb2.addActionListener(new Listener5());
      eb3.addActionListener(new Listener6());
      
   }
   private class Listener1 implements ActionListener
   {
   public void actionPerformed(ActionEvent e)
   {
   southLabel.setText("Incorrect!2+1=3 NOT 2+2");
   }
   }
   private class Listener2 implements ActionListener
   {
   public void actionPerformed(ActionEvent e)
   {
   southLabel.setText("Correct!2+2=4");
   }
   }
   private class Listener3 implements ActionListener
   {
   public void actionPerformed(ActionEvent e)
   {
   southLabel.setText("Incorrect!2+3=5 NOT 2+2");
   }
   }
   private class Listener4 implements ActionListener
   {
   public void actionPerformed(ActionEvent e)
   {
   southLabel.setText("Incorrect!2+4=6 NOT 2+2");
   }
   }
   private class Listener5 implements ActionListener
   {
   public void actionPerformed(ActionEvent e)
   {
   southLabel.setText("Incorrect!2+5=7 NOT 2+2");
   }
   }
   private class Listener6 implements ActionListener
   {
   public void actionPerformed(ActionEvent e)
   {
   southLabel.setText("Incorrect!2+6=8 NOT 2+2");
   }
   }
}