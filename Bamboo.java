import java.awt.*;
import javax.swing.*;

public class Bamboo {
    private int x;
    private int y;
    private Color color;

    public Bamboo(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void drawBamboo(Graphics2D g2) {
        g2.setColor(this.color);
        g2.fillRect(x, y, 6, 2);
        g2.fillRect(x, y + 7, 6, 2);
        g2.fillRect(x, y - 7, 6, 2);
        g2.fillRect(x + 1, y - 7, 2, 16);
        g2.setColor(Color.WHITE);
        g2.fillRect(x + 2, y - 5, 1, 12);
        g2.setColor(this.color);
        g2.fillRect(x + 3, y - 5, 2, 12);
    }
}
