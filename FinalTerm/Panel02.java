import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel02 extends JPanel
{
   private JButton buttonSouth, nButton, buttonEast, buttonWest, cButton;
   private ImageIcon picture, picture2;
   private JTextField southText;
   public Panel02()
   {
      setLayout(new BorderLayout());
    
      southText= new JTextField(240);
      nButton= new JButton("Top");
      buttonSouth = new JButton();
      buttonEast = new JButton("East");
      buttonWest = new JButton("West");
      picture= new ImageIcon("grass.jpg");
      cButton= new JButton (picture);
      buttonSouth.add(southText);
      
      add(cButton,BorderLayout.CENTER);
      add(nButton,BorderLayout.NORTH);
      add(buttonSouth,BorderLayout.SOUTH);
      add(buttonEast,BorderLayout.EAST);
      add(buttonWest,BorderLayout.WEST);
      
      
      nButton.addActionListener(new Listener());
      cButton.addActionListener(new Listener());
      buttonEast.addActionListener(new Listener());
      buttonWest.addActionListener(new Listener());
      southText.addActionListener(new Listener());
    
      cButton.setHorizontalAlignment(SwingConstants.CENTER);
      //nButton.setHorizontalAlignment(SwingConstants.CENTER);
      buttonEast.setHorizontalAlignment(SwingConstants.RIGHT);
      buttonWest.setHorizontalAlignment(SwingConstants.LEFT);
      buttonSouth.setHorizontalAlignment(SwingConstants.CENTER);
   }
   private class Listener implements ActionListener
   {
      public void actionPerformed (ActionEvent e)
      {
         if (e.getSource() == nButton)
         {
            nButton.setText("This is the North");
         }
         else if (e.getSource() == cButton)
         {
            cButton.setText("This is the Center");
         }
         else if (e.getSource() == buttonSouth)
         {
            buttonSouth.setText("This is the South");
         }
         else if (e.getSource() == buttonEast)
         {
            buttonEast.setText("This is the East");
         }
         else if (e.getSource() == buttonWest)
         {
            buttonWest.setText("This is the West");
         }
         else if (e.getSource() == southText)
         {
            nButton.setText("This is the North");
            buttonSouth.setText("This is the South");
            buttonEast.setText("This is the East");
            buttonWest.setText("This is the West");
            buttonSouth.setBackground(Color.white);
            buttonEast.setBackground(Color.white);
            buttonWest.setBackground(Color.white);
            nButton.setBackground(Color.white);
         }
      }
   }
}