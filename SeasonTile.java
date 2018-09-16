import java.awt.*;
import javax.swing.*;

public class SeasonTile extends PictureTile {

    private Image image;

    public SeasonTile(String otherName) {
        super(otherName);

        setToolTipText(toString());

        image = Toolkit.getDefaultToolkit().getImage("images/" + otherName + ".png");

        MediaTracker tracker = new MediaTracker(this);
        tracker.addImage(image, 0);

        try {
            tracker.waitForAll();
        } catch(InterruptedException ie) {
            JOptionPane.showMessageDialog(this, "Unable to load", "Image error", JOptionPane.ERROR_MESSAGE);
        }

        //Resize the image to make it small enough for the tile
        image = image.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.drawImage(image, 25, 15, this);
    }

    //Main for testing
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Season Tiles");

        frame.add(new SeasonTile("Spring"));
        frame.add(new SeasonTile("Summer"));
        frame.add(new SeasonTile("Fall"));
        frame.add(new SeasonTile("Winter"));

        frame.pack();
        frame.setVisible(true);
    }
}
