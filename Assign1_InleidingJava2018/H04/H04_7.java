package Assign1_InleidingJava2018.H04;

import java.awt.*;
import java.applet.*;

public class H04_7 extends Applet {
    /** Opdracht:
     * Teken de zijde waarop de vier van een dobbelsteen staat
     */

    public void init() {
        setSize(500, 500);
    }

    public void paint(Graphics g) {
    setBackground(Color.WHITE);
    g.drawRoundRect(65, 65, 340,340, 10, 10);
    g.fillOval(120, 115, 90, 90);
    g.fillOval(270, 115, 90, 90);
    g.fillOval(120, 255, 90, 90);
    g.fillOval(270, 255, 90, 90);

    }
}
