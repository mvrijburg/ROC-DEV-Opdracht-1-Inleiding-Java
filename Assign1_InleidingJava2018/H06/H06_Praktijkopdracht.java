package H06;

import java.awt.*;
import java.applet.*;

public class H06_Praktijkopdracht extends Applet {
    double a, b, c;
    double equals;
    int center_X, center_Y;

    public void init() {
    setSize(420, 230);

    a = 5.9;
    b = 6.3;
    c = 6.9;

    equals = ((a + b + c) / 3 * 10);
    equals = (int) equals;
    equals = (equals / 10);

        center_X = (500 / 2);
    center_Y = (230 / 2);
    }

    public void paint(Graphics g) {
        setBackground(Color.BLACK);

        g.setColor(Color.WHITE);
        g.drawString("The average of " +a, center_X-175, center_Y);
        g.drawString(", " +b, center_X-72, center_Y);
        g.drawString("and " +c, center_X-46, center_Y);
        g.drawString("equals to " +equals, center_X-1, center_Y);
    }
}
