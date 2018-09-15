import java.awt.*;
import javax.swing.*;

public class CharacterTile extends Tile {
    protected char symbol;

    //Used for the character's unicode
    protected char[] unicode = {
        '\u4E00',
        '\u4E8C',
        '\u4E09',
        '\u56DB',
        '\u4E94',
        '\u516D',
        '\u4E03',
        '\u516B',
        '\u4E5D',
        '\u5317',
        '\u6771',
        '\u897F',
        '\u5357',
        '\u4E2D',
        '\u767C',
    };

    public CharacterTile(char otherSymbol) {
        this.symbol = otherSymbol;

        setToolTipText(toString());
    }

    public boolean matches(Tile otherTile) {
        CharacterTile other = (CharacterTile) otherTile;

        return (super.matches(otherTile) && (this.symbol == other.symbol));
    }

    public String toString() {
        //Return string based on symbol
        switch(this.symbol) {
            case '1':
                return "Character 1";
            case '2':
                return "Character 2";
            case '3':
                return "Character 3";
            case '4':
                return "Character 4";
            case '5':
                return "Character 5";
            case '6':
                return "Character 6";
            case '7':
                return "Character 7";
            case '8':
                return "Character 8";
            case '9':
                return "Character 9";
            case 'N':
                return "North Wind";
            case 'E':
                return "East Wind";
            case 'W':
                return "West Wind";
            case 'S':
                return "South Wind";
            case 'C':
                return "Red Dragon";
            case 'F':
                return "Green Dragon";
            default:
                return "";
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;

        //Draw Small Character in Corner
        g2.setColor(Color.RED);
        g2.drawString(Character.toString(symbol), 68, 23);

        //Decide what type of character tile needs to be drawn
        if(this.symbol == '1' || this.symbol == '2' || this.symbol == '3' ||
           this.symbol == '4' || this.symbol == '5' || this.symbol == '6' ||
            this.symbol == '7' || this.symbol == '8' || this.symbol == '9') {
            drawFirstType(g2);
        } else {
            drawSecondType(g2);
        }
    }

    public int getUnicodeIndex(char symbol) {
        switch(symbol) {
            case '1':
                return 0;
            case '2':
                return 1;
            case '3':
                return 2;
            case '4':
                return 3;
            case '5':
                return 4;
            case '6':
                return 5;
            case '7':
                return 6;
            case '8':
                return 7;
            case '9':
                return 8;
            case 'N':
                return 9;
            case 'E':
                return 10;
            case 'W':
                return 11;
            case 'S':
                return 12;
            case 'C':
                return 13;
            case 'F':
                return 14;
            default:
                return 0;
        }
    }

    //If 1-9
    private void drawFirstType(Graphics2D g2) {
        //Draw Unicode Character
        g2.setColor(Color.BLACK);
        g2.setFont(new Font("Roman", Font.PLAIN, 20));
        g2.drawString(Character.toString(unicode[getUnicodeIndex(this.symbol)]), 40, 30);

        //Draw wan character
        g2.setColor(Color.RED);
        g2.drawString(Character.toString('\u842C'),40,60);
    }

    //If N, S, etc
    private void drawSecondType(Graphics2D g2) {
        if(this.symbol == 'C') {
            g2.setColor(Color.RED);
        } else if(this.symbol == 'F') {
            g2.setColor(Color.decode("#007F00"));
        } else {
            g2.setColor(Color.BLACK);
        }

        //Draw Unicode Character
        g2.setFont(new Font("Roman", Font.PLAIN, 40));
        g2.drawString(Character.toString(unicode[getUnicodeIndex(this.symbol)]), 30, 55);
    }

    //Main for testing
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel tiles = new JPanel();
        JScrollPane	scroller = new JScrollPane(tiles);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Character Tiles");
        frame.add(scroller);

        scroller.setPreferredSize(new Dimension(8 * 100, 40 + 100));

        tiles.add(new CharacterTile('1'));
        tiles.add(new CharacterTile('2'));
        tiles.add(new CharacterTile('3'));
        tiles.add(new CharacterTile('4'));
        tiles.add(new CharacterTile('5'));
        tiles.add(new CharacterTile('6'));
        tiles.add(new CharacterTile('7'));
        tiles.add(new CharacterTile('8'));
        tiles.add(new CharacterTile('9'));
        tiles.add(new CharacterTile('N'));
        tiles.add(new CharacterTile('E'));
        tiles.add(new CharacterTile('W'));
        tiles.add(new CharacterTile('S'));
        tiles.add(new CharacterTile('C'));
        tiles.add(new CharacterTile('F'));

        frame.pack();
        frame.setVisible(true);
        frame.setVisible(true);
    }
}
