import javax.swing.JApplet;
import java.awt.*;

public class Face extends JApplet {

    public void paint(Graphics g) {

        final int PAGE_WIDTH = 600;
        final int PAGE_HEIGHT = 400;

        int x, y;
        int width, height;

        Color myColor = new Color (65280);

        setBackground (Color.white);
        g.setColor(Color.white);
        g.fillRect(0, 0, PAGE_WIDTH, PAGE_HEIGHT);

        g.setColor (myColor);

        x = 150;
        y = 100;
        width = 200;
        height = 200;

        g.fillOval(x, y, width, height);
        
        g.setColor (Color.RED);
        g.fillOval(200, 150, 50, 50);
        
        g.fillOval(300, 150, 50, 50);
        
        g.setColor(new Color(0, 0, 0));
        
        g.fillOval(220, 165, 25, 25);
        
        g.fillOval(320, 165, 25, 25);
        
        g.fillArc(200, 190, 100, 90, 0, -180);
        
        g.setColor(Color.WHITE);
        g.fillArc(210, 205, 80, 70, 0, -180);
        
        g.setColor(Color.BLACK);
        g.drawLine(215, 260, 285, 260);
    }
}
