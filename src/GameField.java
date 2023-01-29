import javax.swing.*;
import java.awt.*;

public class GameField extends JPanel {

    private final int SIZE = 320;
    private final int DOT_SIZE = 16;
    private final int ALL_DOTS = 400;
    private Image dot;
    private Image apple;
    private int appleX;
    private int appleY;
    private int[] x = new int[ALL_DOTS];
    private int[] y = new int[ALL_DOTS];
    private int dots;
    private Timer timer;

    private boolean left = false;
    private boolean right = false;
    private boolean up = true;
    private boolean down = false;
    private boolean inGame = true;
    Image pic;


    public GameField(){
        ImageIcon obj = new ImageIcon("проц.png");
        pic = obj.getImage();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(pic, 0, 0, null);
    }

    public  void loadImage(){
        JFrame f = new JFrame();
        GameField pic = new GameField();
        f.add(pic);
        ImageIcon imageIconApple = new ImageIcon("apple.png");
        apple = imageIconApple.getImage();
        ImageIcon imageIcon = new ImageIcon("dot.png");
        dot = imageIcon.getImage();
    }
}
