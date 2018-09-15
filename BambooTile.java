import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class BambooTile extends RankTile {
    public ArrayList<Bamboo> bamboo = new ArrayList();

    public BambooTile(int otherRank) {
        super(otherRank);

        setToolTipText(toString());
    }

    public String toString() {
        switch(this.rank) {
            case 2:
                return "Bamboo 2";
            case 3:
                return "Bamboo 3";
            case 4:
                return "Bamboo 4";
            case 5:
                return "Bamboo 5";
            case 6:
                return "Bamboo 6";
            case 7:
                return "Bamboo 7";
            case 8:
                return "Bamboo 8";
            case 9:
                return "Bamboo 9";
            default:
                return "";
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        //Decide how many bamboo need to be drawn
        switch(this.rank) {
            case 2:
                this.bamboo = drawBamboo2();
                break;
            case 3:
                this.bamboo = drawBamboo3();
                break;
            case 4:
                this.bamboo = drawBamboo4();
                break;
            case 5:
                this.bamboo = drawBamboo5();
                break;
            case 6:
                this.bamboo = drawBamboo6();
                break;
            case 7:
                this.bamboo = drawBamboo7();
                break;
            case 8:
                this.bamboo = drawBamboo8();
                break;
            case 9:
                this.bamboo = drawBamboo9();
                break;
        }

        for (Bamboo b : bamboo) {
            if (b != null) {
                b.drawBamboo(g2);
            }
        }
    }

    //Bamboo 2
    public ArrayList<Bamboo> drawBamboo2() {
        ArrayList<Bamboo> list = new ArrayList();

        list.add(new Bamboo(46, 27, Color.BLUE));
        list.add(new Bamboo(46, 47, Color.decode("#007F00")));

        return list;
    }

    //Bamboo 3
    public ArrayList<Bamboo> drawBamboo3() {
        ArrayList<Bamboo> list = new ArrayList();

        list.add(new Bamboo(46, 27, Color.BLUE));
        list.add(new Bamboo(38, 47, Color.decode("#007F00")));
        list.add(new Bamboo(54, 47, Color.decode("#007F00")));

        return list;
    }

    //Bamboo 4
    public ArrayList<Bamboo> drawBamboo4() {
        ArrayList<Bamboo> list = new ArrayList();

        list.add(new Bamboo(38, 27, Color.BLUE));
        list.add(new Bamboo(54, 27, Color.decode("#007F00")));
        list.add(new Bamboo(38, 47, Color.decode("#007F00")));
        list.add(new Bamboo(54, 47, Color.BLUE));

        return list;
    }

    //Bamboo 5
    public ArrayList<Bamboo> drawBamboo5() {
        ArrayList<Bamboo> list = new ArrayList();

        list.add(new Bamboo(32, 27, Color.decode("#007F00")));
        list.add(new Bamboo(62, 27, Color.BLUE));
        list.add(new Bamboo(32, 47, Color.BLUE));
        list.add(new Bamboo(62, 47, Color.decode("#007F00")));
        list.add(new Bamboo(47, 37, Color.RED));

        return list;
    }

    //Bamboo 6
    public ArrayList<Bamboo> drawBamboo6() {
        ArrayList<Bamboo> list = new ArrayList();

        list.add(new Bamboo(32, 27, Color.decode("#007F00")));
        list.add(new Bamboo(62, 27, Color.decode("#007F00")));
        list.add(new Bamboo(32, 47, Color.BLUE));
        list.add(new Bamboo(62, 47, Color.BLUE));
        list.add(new Bamboo(47, 27, Color.decode("#007F00")));
        list.add(new Bamboo(47, 47, Color.BLUE));

        return list;
    }

    //Bamboo 7
    public ArrayList<Bamboo> drawBamboo7() {
        ArrayList<Bamboo> list = new ArrayList();

        list.add(new Bamboo(32, 40, Color.decode("#007F00")));
        list.add(new Bamboo(62, 40, Color.decode("#007F00")));
        list.add(new Bamboo(32, 60, Color.decode("#007F00")));
        list.add(new Bamboo(62, 60, Color.decode("#007F00")));
        list.add(new Bamboo(47, 40, Color.BLUE));
        list.add(new Bamboo(47, 60, Color.BLUE));
        list.add(new Bamboo(47, 18, Color.RED));

        return list;
    }

    //Bamboo 8
    public ArrayList<Bamboo> drawBamboo8() {
        ArrayList<Bamboo> list = new ArrayList();

        list.add(new Bamboo(40, 40, Color.RED));
        list.add(new Bamboo(54, 40, Color.RED));
        list.add(new Bamboo(32, 60, Color.BLUE));
        list.add(new Bamboo(62, 60, Color.BLUE));
        list.add(new Bamboo(47, 60, Color.BLUE));
        list.add(new Bamboo(47, 18, Color.decode("#007F00")));
        list.add(new Bamboo(62, 18, Color.decode("#007F00")));
        list.add(new Bamboo(32, 18, Color.decode("#007F00")));

        return list;
    }

    //Bamboo 9
    public ArrayList<Bamboo> drawBamboo9() {
        ArrayList<Bamboo> list = new ArrayList();

        list.add(new Bamboo(32, 40, Color.RED));
        list.add(new Bamboo(62, 40, Color.decode("#007F00")));
        list.add(new Bamboo(32, 60, Color.RED));
        list.add(new Bamboo(62, 60, Color.decode("#007F00")));
        list.add(new Bamboo(47, 40, Color.BLUE));
        list.add(new Bamboo(47, 60, Color.BLUE));
        list.add(new Bamboo(47, 18, Color.BLUE));
        list.add(new Bamboo(62, 18, Color.decode("#007F00")));
        list.add(new Bamboo(32, 18, Color.RED));

        return list;
    }

    //Main for testing
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Bamboo Tiles");

        frame.add(new BambooTile(2));
        frame.add(new BambooTile(3));
        frame.add(new BambooTile(4));
        frame.add(new BambooTile(5));
        frame.add(new BambooTile(6));
        frame.add(new BambooTile(7));
        frame.add(new BambooTile(8));
        frame.add(new BambooTile(9));

        frame.pack();
        frame.setVisible(true);
    }
}
