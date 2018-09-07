package Assign1_InleidingJava2018.H04;

import java.awt.*;
import java.applet.*;

public class H04_3 extends Applet {
    /** opdracht:
     *      Teken de Nederlandse vlag aan een vlaggenstok
     */
    public void init() {
        setSize(600, 500);
    }

    public void paint(Graphics g) {
        setBackground(Color.white);

        // red
        g.setColor(Color.red);
        g.fillRect(210, 120, 120, 25);


        // blue
        g.setColor(Color.blue);
        g.fillRect(210, 170, 120, 25);

        // pole
        g.setColor(Color.orange);
        g.fillRect(200,100,10,400);

        // lineart
        g.setColor(Color.black);
        g.drawRect(200,100,10,400);
        g.drawLine(210, 120, 330, 120);
        g.drawLine(210, 195, 330, 195);
        g.drawLine(330, 120, 330, 195);
    }

}
