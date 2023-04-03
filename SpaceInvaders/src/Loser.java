import java.awt.Color;
import java.awt.Graphics;

public class Loser extends GraphicsObject {
    int x;
    int y;

    public Loser(int x, int y){
        super(x, y);
    }
    // Loser Screen
    public void draw(Graphics g){
        g.setColor(new Color(0, 0, 0));
        g.fillRect(x,y,400, 400);
        g.setColor(new Color(255, 255, 255));
        g.drawString("Game Over: Better Luck Next Time 😉", 200, 200);
    }
}