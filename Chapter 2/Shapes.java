// Shapes.java
//
// The program will draw two filled rectangles and a
// filled oval.
// ****************************************************************
import javax.swing.JApplet;
import java.awt.*;
public class Shapes extends JApplet
{
    public void init()
    {
        // Set the background color
        getContentPane().setBackground (Color.yellow);
    }

    public void paint (Graphics page)
    {
        // Declare size constants
        final int MAX_SIZE = 300;
        final int PAGE_WIDTH = 600;
        final int PAGE_HEIGHT = 400;
        // Declare variables
        int x, y; // x and y coordinates of upper left-corner of each shape
        int width, height; // width and height of each shape
        super.paint(page);
        // Set the color for the next shape to be drawn
        page.setColor (Color.blue);
        // Assign the corner point and width and height
        x = 0;
        y = 0;
        width = 100;
        height = 70;
        // Draw the rectangle
        page.fillRect(x, y, width, height);
        
        page.setColor(Color.WHITE);
        page.fillRect(20, 20, 50, 30);
        
        page.setColor(Color.BLACK);
        page.fillOval(20, 60, 20, 50);
        
        page.setColor(Color.RED);
        page.fillOval(200, 200, 100, 90);
    }
}
/*
 * 1. The rectangle is drawn at the top left of the screen
 * 2.
 */
