import java.awt.*;
import javax.swing.*;

public class Pancake {
    public void drawPancake(Graphics2D g2) {
        g2.setPaint(Color.decode("#007F00"));
        g2.fillOval(27, 17, 45, 45);
        g2.setPaint(Color.BLACK);
        g2.drawOval(27, 17, 45, 45);
        g2.setPaint(Color.WHITE);

        for (int i = 0; i < 16; i++) {
            double t = 2 * Math.PI * i / 16;
            int x = (int) Math.round(48 + (27.0 - 8) * Math.cos(t));
            int y = (int) Math.round(38 + (27.0 - 8) * Math.sin(t));
            g2.fillOval(x, y, 3, 3);
        }
    }
}
