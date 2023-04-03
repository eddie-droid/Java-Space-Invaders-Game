import java.awt.Color;
import java.awt.Graphics;

public class GraphicsObject {

    double x;
    double y;
    double speed_x;
    double speed_y;

    public GraphicsObject(double x, double y) {
        this.x = x;
        this.y = y;
        this.speed_x = 0;
        this.speed_y = 0;
    }

    public void draw(Graphics g) {
    }

    public void update(int pic_width, int pic_height, int frame) {
        this.x += this.speed_x;
        this.y += this.speed_y;
    }
}