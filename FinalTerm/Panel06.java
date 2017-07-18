import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel06 extends JPanel
{
   private JButton button;
   private JTextField field;
   private JLabel label;

   public Panel06()
   {
      setLayout(new FlowLayout());
      
      button = new JButton("SQRT");
      field = new JTextField("Enter a number", 10);
      label = new JLabel("0.0");
      label.setFont(new Font("Helvetica", Font.ITALIC, 36));
      
      add(field);
      add(button);
      add(label);
      
      button.addActionListener(new Listener1());
      
   }
   private class Listener1 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         double d = Double.parseDouble(field.getText());
         if(d<0)
         {
         label.setText("Can't do sqrt of negative!");
         }
         else
         label.setText(Math.sqrt(d)+ "");
      }
   }
}