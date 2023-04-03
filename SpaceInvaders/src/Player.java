import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.Random;

public class Player extends GraphicsObject {

    private int width;
    private int height;
    private Color color;

    public Player(double x, double y, int width, int height, Color color) {
        super(x, y);
        this.width = width;
        this.height = height;
        this.color = color;
    }
    // graphics of player (square)
    @Override
    public void draw(Graphics g) {
        g.setColor(this.color);

       g.fillRect((int) this.x, (int) this.y, this.width, this.height);
        
        
    }
}