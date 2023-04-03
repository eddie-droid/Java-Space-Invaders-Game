import java.awt.Color;
import java.awt.Graphics;

public class Winner extends GraphicsObject {
    int x;
    int y;

    public Winner(int x, int y){
        super(x, y);
    }
    //Winner Screen
    public void draw(Graphics g){
        g.setColor(new Color(255, 255, 255));
        g.fillRect(x,y,600, 600);
        g.setColor(new Color(0, 0, 0));
        g.drawString("Congrats! You won 🥳", 150, 150);
    }
}