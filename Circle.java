import java.awt.*;
import javax.swing.*;

//Circle class to draw circles for CircleTile
public class Circle {
    private int x;
    private int y;
    private Color color;

    public Circle(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void drawCircle(Graphics2D g2) {
        g2.setPaint(this.color);
        g2.drawOval(x, y, 10, 10);
        g2.fillOval(x, y, 10, 10);

        //Set color to white and draw X
        g2.setPaint(Color.WHITE);
        g2.setFont(new Font("Roman", Font.PLAIN, 11));
        g2.drawString("X", this.x + 2, this.y + 9);
    }
}
