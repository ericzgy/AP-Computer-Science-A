import javax.swing.*;
import java.awt.*;

public class Panel01 extends JPanel
{
   private JLabel label1, label2, label3, label4, label5;

   public Panel01()
   {
      setLayout(new BorderLayout());
      label1 = new JLabel("Left");
      add(label1, BorderLayout.WEST);
      label1.setHorizontalAlignment(SwingConstants.LEFT);
      label2 = new JLabel("Top");
      add(label2, BorderLayout.NORTH);
      label2.setHorizontalAlignment(SwingConstants.CENTER);
      label3 = new JLabel("Center");
      add(label3, BorderLayout.CENTER);
      label3.setHorizontalAlignment(SwingConstants.CENTER);
      label4 = new JLabel("Bottom");
      add(label4, BorderLayout.SOUTH);
      label4.setHorizontalAlignment(SwingConstants.CENTER);
      label5 = new JLabel("Right");
      add(label5, BorderLayout.EAST);
      label5.setHorizontalAlignment(SwingConstants.RIGHT);
   }
}