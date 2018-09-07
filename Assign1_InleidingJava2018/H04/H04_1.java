package Assign1_InleidingJava2018.H04;

import java.awt.*;
import java.applet.*;

public class H04_1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.white);
        g.drawLine(50, 120, 150, 120);
        g.drawLine(50, 120, 100, 60);
        g.drawLine(150, 120, 100, 60);
    }
}
