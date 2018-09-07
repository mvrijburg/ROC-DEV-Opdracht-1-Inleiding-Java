package Assign1_InleidingJava2018.H04;

import java.awt.*;
import java.applet.*;

public class H04_2 extends Applet {
    /** opdracht:
     *      Teken een huis met daarin tenminste één raam en een deur
     */

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.white);
        // base
        g.drawRect(125, 200, 250, 250);
        // roof
        g.drawLine(125,200,250,50);
        g.drawLine(375,200,250,50);
        // window
        g.drawRect(140, 330, 100, 50);
        // door
        g.fillRect(260, 300, 80, 150);
    }
}
