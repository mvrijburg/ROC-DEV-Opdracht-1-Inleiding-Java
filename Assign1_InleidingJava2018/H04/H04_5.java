package Assign1_InleidingJava2018.H04;

import java.awt.*;
import java.applet.*;

public class H04_5 extends Applet {
    /** Opdracht:
     *      Teken met fillArc() op een blauwe achtergrond een ellips die met geel is gevuld.
     */

    public void init() {
        setSize(856, 480);
    }

    public void paint(Graphics g) {
        setBackground(Color.BLUE);
        g.setColor(Color.YELLOW);
        g.fillArc(300, 140, 280, 280, 90, 45);
    }
}
