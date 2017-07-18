import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel07 extends JPanel
{
   private JButton button, b2,b3, b4;
   private JLabel label;
   private JPanel panel;

   public Panel07()
   {
      setLayout(new BorderLayout());
      
      panel = new JPanel(new FlowLayout());
      button = new JButton("Random");
      b2 = new JButton("Cube Root");
      b3 = new JButton("Reciprocal");
      b4 = new JButton("Quit");
      label = new JLabel("0.0");
      label.setFont(new Font("Helvetica", Font.ITALIC, 40));
      
      panel.add(button);
      panel.add(b2);
      panel.add(b3);
      panel.add(b4);
      add(label, BorderLayout.NORTH);
      add(panel, BorderLayout.CENTER);
      label.setHorizontalAlignment(SwingConstants.CENTER);
      
      button.addActionListener(new Listener1());
      b2.addActionListener(new Listener2());
      b3.addActionListener(new Listener3());
      b4.addActionListener(new Listener4());      
   }
   private class Listener1 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
        label.setText("" + Math.random()*50);
      }
   }
    private class Listener2 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
        double d = Double.parseDouble(label.getText());
        label.setText("" + Math.pow(d, 1.0/30));
      }
   }
    private class Listener3 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
        double d = Double.parseDouble(label.getText());
        label.setText("" + 1.0/d);
      }
   }
    private class Listener4 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
       System.exit(0); 
      }
   }
}