package H06;

import java.applet.*;
import java.awt.*;

public class H06_2 extends Applet {
    int year, day, hour, minute, second;
    int center, left, right;
    int row_1, row_2;

    public void init() {
    setSize(856, 480);

    second = 1;
    minute = (second * 60);
    hour = (minute * 60);
    day = (hour * 24);
    year = (day * 365);

    center = (856 / 2);
    left = (center / 2); /* Put text in the left table */
    right = (center / 2 + center); /* Put text in the right table */

    row_1 = 175;
    row_2 = 168;
    }

    public void paint(Graphics g) {
        g.drawLine(428,40, center, 420); /* Vertical */
        g.drawLine(40, 95, 800, 95); /* Horizontal */

        g.drawLine(40,row_1, 800, row_1);
        g.drawLine(40,row_1+50, 800, row_1+50);
        g.drawLine(40,row_1+100, 800, row_1+100);
        g.drawLine(40,row_1+150, 800, row_1+150);
        g.drawLine(40,row_1+200, 800, row_1+200);

        /* Info */
        g.drawString("Metric", left, 70);
        g.drawString("Metric in Seconds", right-45, 70);

        /* Metrics */
        g.drawString("Seconds", left, row_2);
        g.drawString("Minutes", left, row_2+50);
        g.drawString("Hours", left, row_2+100);
        g.drawString("Days", left, row_2+150);
        g.drawString("Years", left, row_2+200);

        /* In seconds */
        g.drawString(""+second+" Seconds", right-40, row_2);
        g.drawString(""+minute+" Seconds", right-40, row_2+50);
        g.drawString(""+hour+" Seconds", right-40, row_2+100);
        g.drawString(""+day+" Seconds", right-40, row_2+150);
        g.drawString(""+year+" Seconds", right-40, row_2+200);
    }
}