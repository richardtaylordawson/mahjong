import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class CircleTile extends RankTile {
    public ArrayList<Circle> circles = new ArrayList();

    public CircleTile(int otherRank) {
        super(otherRank);

        setToolTipText(toString());
    }

    public String toString() {
        //Return string based on rank
        switch(this.rank) {
            case 1:
                return "Circle 1";
            case 2:
                return "Circle 2";
            case 3:
                return "Circle 3";
            case 4:
                return "Circle 4";
            case 5:
                return "Circle 5";
            case 6:
                return "Circle 6";
            case 7:
                return "Circle 7";
            case 8:
                return "Circle 8";
            case 9:
                return "Circle 9";
            default:
                return "";
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;

        //Decide how many circles need to be drawn
        switch(this.rank) {
            case 1:
                this.circles = drawCircle1();
                Pancake p = new Pancake();
                p.drawPancake(g2);
                break;
            case 2:
                this.circles = drawCircle2();
                break;
            case 3:
                this.circles = drawCircle3();
                break;
            case 4:
                this.circles = drawCircle4();
                break;
            case 5:
                this.circles = drawCircle5();
                break;
            case 6:
                this.circles = drawCircle6();
                break;
            case 7:
                this.circles = drawCircle7();
                break;
            case 8:
                this.circles = drawCircle8();
                break;
            case 9:
                this.circles = drawCircle9();
                break;
        }

        for (Circle c : circles) {
            if (c != null) {
                c.drawCircle(g2);
            }
        }
    }

    //Circle 1
    public ArrayList<Circle> drawCircle1() {
        ArrayList<Circle> list = new ArrayList();

        list.add(new Circle(45, 35, Color.RED));

        return list;
    }

    //Circle 2
    public ArrayList<Circle> drawCircle2() {
        ArrayList<Circle> list = new ArrayList();

        list.add(new Circle(44, 27, Color.decode("#007F00")));
        list.add(new Circle(44, 47, Color.RED));

        return list;
    }

    //Circle 3
    public ArrayList<Circle> drawCircle3() {
        ArrayList<Circle> list = new ArrayList();

        list.add(new Circle(25, 17, Color.BLUE));
        list.add(new Circle(64, 52, Color.decode("#007F00")));
        list.add(new Circle(44, 34, Color.RED));

        return list;
    }

    //Circle 4
    public ArrayList<Circle> drawCircle4() {
        ArrayList<Circle> list = new ArrayList();

        list.add(new Circle(32, 17, Color.BLUE));
        list.add(new Circle(57, 52, Color.BLUE));
        list.add(new Circle(57, 17, Color.decode("#007F00")));
        list.add(new Circle(32, 52, Color.decode("#007F00")));

        return list;
    }

    //Circle 5
    public ArrayList<Circle> drawCircle5() {
        ArrayList<Circle> list = new ArrayList();

        list.add(new Circle(25, 17, Color.BLUE));
        list.add(new Circle(64, 52, Color.BLUE));
        list.add(new Circle(64, 17, Color.decode("#007F00")));
        list.add(new Circle(25, 52, Color.decode("#007F00")));
        list.add(new Circle(44, 34, Color.RED));

        return list;
    }

    //Circle 6
    public ArrayList<Circle> drawCircle6() {
        ArrayList<Circle> list = new ArrayList();

        list.add(new Circle(32, 17, Color.decode("#007F00")));
        list.add(new Circle(57, 52, Color.RED));
        list.add(new Circle(57, 17, Color.decode("#007F00")));
        list.add(new Circle(32, 52, Color.RED));
        list.add(new Circle(57, 34, Color.RED));
        list.add(new Circle(32, 34, Color.RED));

        return list;
    }

    //Circle 7
    public ArrayList<Circle> drawCircle7() {
        ArrayList<Circle> list = new ArrayList();

        list.add(new Circle(25, 12, Color.decode("#007F00")));
        list.add(new Circle(64, 24, Color.decode("#007F00")));
        list.add(new Circle(44, 18, Color.decode("#007F00")));
        list.add(new Circle(32, 52, Color.RED));
        list.add(new Circle(57, 34, Color.RED));
        list.add(new Circle(57, 52, Color.RED));
        list.add(new Circle(32, 34, Color.RED));

        return list;
    }

    //Circle 8
    public ArrayList<Circle> drawCircle8() {
        ArrayList<Circle> list = new ArrayList();

        list.add(new Circle(32, 14, Color.BLUE));
        list.add(new Circle(57, 56, Color.BLUE));
        list.add(new Circle(57, 14, Color.BLUE));
        list.add(new Circle(32, 56, Color.BLUE));
        list.add(new Circle(57, 28, Color.BLUE));
        list.add(new Circle(32, 28, Color.BLUE));
        list.add(new Circle(57, 42, Color.BLUE));
        list.add(new Circle(32, 42, Color.BLUE));

        return list;
    }

    //Circle 9
    public ArrayList<Circle> drawCircle9() {
        ArrayList<Circle> list = new ArrayList();

        list.add(new Circle(25, 17, Color.decode("#007F00")));
        list.add(new Circle(64, 17, Color.decode("#007F00")));
        list.add(new Circle(44, 17, Color.decode("#007F00")));
        list.add(new Circle(25, 34, Color.RED));
        list.add(new Circle(64, 34, Color.RED));
        list.add(new Circle(44, 34, Color.RED));
        list.add(new Circle(25, 52, Color.BLUE));
        list.add(new Circle(64, 52, Color.BLUE));
        list.add(new Circle(44, 52, Color.BLUE));

        return list;
    }

    //Main for testing
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Circle Tiles");

        frame.add(new CircleTile(1));
        frame.add(new CircleTile(2));
        frame.add(new CircleTile(3));
        frame.add(new CircleTile(4));
        frame.add(new CircleTile(5));
        frame.add(new CircleTile(6));
        frame.add(new CircleTile(7));
        frame.add(new CircleTile(8));
        frame.add(new CircleTile(9));

        frame.pack();
        frame.setVisible(true);
    }
}
