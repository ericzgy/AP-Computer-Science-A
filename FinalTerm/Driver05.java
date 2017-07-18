import javax.swing.*;

public class Driver05
{
public static void main(String[] args)
{
JFrame frame = new JFrame();
frame.setSize(800, 650);
frame.setLocation(200, 100);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setContentPane(new Panel05());
frame.setVisible(true);
}
}