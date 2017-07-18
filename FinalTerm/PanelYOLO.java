import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelYOLO extends JPanel
{
   private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
   private JTextField field;
   private JPanel panel;
   public PanelYOLO()
   {
      setLayout(new BorderLayout());
   
      b1 = new JButton("1");
      b2 = new JButton("2");
      b3 = new JButton("3");
      b4 = new JButton("4");
      b5 = new JButton("5");
      b6 = new JButton("6");
      b7 = new JButton("7");
      b8 = new JButton("8");
      b9 = new JButton("9");
      
      field = new JTextField(500);
      field.setPreferredSize(new Dimension(50, 75));
      
      panel = new JPanel(new GridLayout(3, 3));
      
      panel.add(b1);
      panel.add(b2);
      panel.add(b3);
      panel.add(b4);
      panel.add(b5);
      panel.add(b6);
      panel.add(b7);
      panel.add(b8);
      panel.add(b9);
      
      add(panel, BorderLayout.CENTER);
      
      add(field, BorderLayout.NORTH);
   }
}