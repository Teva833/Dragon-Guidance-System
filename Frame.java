import javax.swing.JFrame;
import java.awt.Component;

public class Frame extends JFrame
{
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    public Frame()
    {
        super("WORKING CODE LOL PRANKT no shoot no gun please");
        setSize(WIDTH,HEIGHT);
        Event theGame = new Event();
        ((Component)theGame).setFocusable(true);
        getContentPane().add(theGame);
        setVisible(true);
    }
    
    public static void main( String args[] )
    {
        Frame run = new Frame();
    }
}