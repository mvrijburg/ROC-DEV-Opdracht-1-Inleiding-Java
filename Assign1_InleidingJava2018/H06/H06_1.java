package Assign1_InleidingJava2018.H06;

import java.applet.*;
import java.awt.*;

public class H06_1 extends Applet {

    int center;
    int left;
    int right;

    int row_1;
    int row_2;

    public void init() {
        setSize(856, 480);

        center = 856/2;
        left = center/2; /* Put text in the left table */
        right = center/2+center; /* Put text in the right table */

        row_1 = 175;
        row_2 = 168;

        /***
         * Doing basic math to make my life a lot easier
         * Would use math to calculate the amount of money per person, however it appears to not draw decimals so
         * I just had to put those in myself.
         */
    }

    public void paint(Graphics g) {
        /* Table */
        g.drawLine(428,40, center, 380); /* Vertical */
        g.drawLine(40, 95, 800, 95); /* Horizontal */

        g.drawLine(40,175, 800, row_1);
        g.drawLine(40,225, 800, row_1+50);
        g.drawLine(40,275, 800, row_1+100);
        g.drawLine(40,325, 800, row_1+150);

        /* Info */
        g.drawString("Persons", left, 70);
        g.drawString("Money", right, 70);

        /* Persons */
        g.drawString("Me", left, row_2);
        g.drawString("Jan", left, row_2+50);
        g.drawString("Ali", left, row_2+100);
        g.drawString("Jeannette", left, row_2+150);

        /* Money */
        g.drawString("€28.25", right, row_2);
        g.drawString("€28.25", right, row_2+50);
        g.drawString("€28.25", right, row_2+100);
        g.drawString("€28.25", right, row_2+150);
    }
}