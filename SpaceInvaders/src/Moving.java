import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class Moving extends GraphicsObject {
    double speed_x;
    double speed_y;
    double startPosition;
    double endPosition;

    public Moving(double x, double y, double speed_x, double speed_y, double endPosition,double startPosition) {
        super(x, y);
        this.speed_x = speed_x;
        this.speed_y = speed_y;
        this.endPosition = endPosition;
        this.startPosition = startPosition;
    }

    // body of each alien square
    public void draw(Graphics g) {
        g.setColor(new Color(0, 255, 0)); //green
        g.fillRect((int) x, (int) y, 10, 10);
    }
    // updates each alien square
    public void update(int pic_width, int pic_height, int frame) {
        if (this.x <= startPosition && this.speed_x == -5.0) {
            this.x += 1;
            this.speed_x = 5;
        }
        else if (this.x >= endPosition && speed_x == 5.0) {
            this.x -= 1;
            this.speed_x = -5;
        }
        else {
            this.x += this.speed_x;
            this.y += this.speed_y;
        }
    }
}