package Assign1_InleidingJava2018.H04;

import java.awt.*;
import java.applet.*;

public class H04_6 extends Applet {
    /** Opdracht
     * Teken een stoplicht
     */

    public void init(){
        setSize(720, 1280);
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.fillRect(200, 100, 320, 800);

        g.setColor(Color.GREEN);
        g.fillOval(258, 140, 200, 200);

        g.setColor(Color.ORANGE);
        g.fillOval(258, 380, 200, 200);

        g.setColor(Color.RED);
        g.fillOval(258, 620, 200, 200);
    }
}
