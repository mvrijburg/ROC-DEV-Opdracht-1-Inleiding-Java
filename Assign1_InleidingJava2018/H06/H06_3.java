package H06;

import java.applet.*;
import java.awt.*;

public class H06_3 extends Applet {
    int a, b;
    int center_X, center_Y;

    public void init() {
    setSize(640, 360);

    a = 1;
    b = 2147483647;

    center_X = (640 / 2);
    center_Y = (360 / 2);

    }

    public void paint (Graphics g) {
        setBackground(Color.BLACK);

        g.setColor(Color.WHITE);
        g.drawString(""+(a+b), center_X-40, center_Y);
    }

}
