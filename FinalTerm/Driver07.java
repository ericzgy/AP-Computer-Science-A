import javax.swing.*;

public class Driver07
{
public static void main(String [] args)
{
JFrame frame = new JFrame("My first GUI");
frame.setSize(500, 150);
frame.setLocation(200, 200);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setContentPane(new Panel07());
frame.setVisible(true);
}
}