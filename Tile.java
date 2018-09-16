import java.awt.*;
import javax.swing.*;

abstract public class Tile extends JPanel {
    public Tile() {
        setPreferredSize(new Dimension(100, 100));
    }

    public boolean matches(Tile otherTile) {
        return (getClass() == otherTile.getClass())
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;

        //Left Bottom of tile
        Polygon leftBottom = new Polygon();
        leftBottom.addPoint(20, 10);
        leftBottom.addPoint(10, 30);
        leftBottom.addPoint(10, 90);
        leftBottom.addPoint(20, 70);

        //Bottom Bottom of tile
        Polygon bottomBottom = new Polygon();
        bottomBottom.addPoint(20, 70);
        bottomBottom.addPoint(10, 90);
        bottomBottom.addPoint(70, 90);
        bottomBottom.addPoint(80, 70);

        //Middle Left of tile
        Polygon middleLeft = new Polygon();
        middleLeft.addPoint(20, 10);
        middleLeft.addPoint(15, 20);
        middleLeft.addPoint(15, 80);
        middleLeft.addPoint(20, 70);

        //Middle-bottom
        Polygon middleBottom = new Polygon();
        middleBottom.addPoint(20, 70);
        middleBottom.addPoint(15, 80);
        middleBottom.addPoint(75, 80);
        middleBottom.addPoint(80, 70);

        Color red = Color.decode("#FF0000");
        Color darkred = Color.decode("#8B0000");
        Color neutral = Color.decode("#FDF3E7");
        Color white = Color.decode("#FFFFFF");

        g2.setPaint(new GradientPaint(0,75,red,75,0,darkred,true));

        g2.fillPolygon(leftBottom);
        g2.fillPolygon(bottomBottom);

        g2.setPaint(new GradientPaint(0,20,neutral,0,60,white,true));

        g2.fillPolygon(middleLeft);
        g2.fillPolygon(middleBottom);
        g2.fillRect(20, 10, 60, 60);

        g2.setPaint(Color.decode("#000000"));

        g2.drawPolygon(leftBottom);
        g2.drawPolygon(bottomBottom);
        g2.drawPolygon(middleLeft);
        g2.drawPolygon(middleBottom);
        g2.drawRect(20, 10, 60, 60);
    }
}
