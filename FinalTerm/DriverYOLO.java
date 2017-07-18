import javax.swing.*;

public class DriverYOLO
{
public static void main(String [] args)
{
JFrame frame = new JFrame();
frame.setSize(800, 650);
frame.setLocation(200, 100);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setContentPane(new PanelYOLO());
frame.setVisible(true);
}
}