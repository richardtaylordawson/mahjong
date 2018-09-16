import java.awt.*;
import javax.swing.*;

public class WhiteDragonTile extends Tile {
    public String toString() {
        return "White Dragon";
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.drawRect(28, 18, 44, 44);
        g2.drawRect(32, 22, 36, 36);

        Stroke dashed = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);

        g2.setStroke(dashed);
        g2.setPaint(Color.BLUE);
        g2.drawRect(30, 20, 40, 40);
    }

    //Main for testing
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("White Dragon Tile");

        frame.add(new WhiteDragonTile());

        frame.pack();
        frame.setVisible(true);
    }
}
