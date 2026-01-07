import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class CarGame extends JPanel implements ActionListener, KeyListener {

    int playerX = 180;
    int playerY = 500;

    int enemyX = 180;
    int enemyY = 0;

    int speed = 5;
    Timer timer;
    Random rand = new Random();

    public CarGame() {
        timer = new Timer(20, this);
        timer.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Road
        g.setColor(Color.white);
        g.fillRect(0, 0, 400, 600);

        // Player Car
        g.setColor(Color.BLUE);
        g.fillRect(playerX, playerY,40, 80);

        // Enemy Car
        g.setColor(Color.orange);
        g.fillRect(enemyX, enemyY, 40, 80);
    }

    public void actionPerformed(ActionEvent e) {
        enemyY += speed;

        if (enemyY > 600) {
            enemyY = 0;
            enemyX = rand.nextInt(360);
        }

        // Collision Detection
        Rectangle player = new Rectangle(playerX, playerY, 40, 80);
        Rectangle enemy = new Rectangle(enemyX, enemyY, 40, 80);

        if (player.intersects(enemy)) {
            timer.stop();
            JOptionPane.showMessageDialog(this, "OopGame Over!");
            System.exit(0);
        }

        repaint();
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT && playerX > 0) {
            playerX -= 20;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT && playerX < 360) {
            playerX += 20;
        }
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Car Game");
        CarGame game = new CarGame();

        frame.add(game);
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
