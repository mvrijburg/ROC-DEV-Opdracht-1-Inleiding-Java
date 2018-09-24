package Assign1_InleidingJava2018.H04;

import java.applet.*;
import java.awt.*;

public class H04_Praktijkopdracht extends Applet {

    public void init() {
        setSize(720, 480);
        setBackground(Color.WHITE);
    }

    public void paint(Graphics g) {
        g.drawLine(10, 20, 231, 20);

        g.drawRect(10, 40, 221, 101);

        g.drawRoundRect(10, 160, 221, 101, 30, 30);

        g.setColor(Color.MAGENTA);
        g.fillRect(240, 40, 221, 101);
        g.setColor(Color.BLACK);
        g.drawOval(240, 40, 221, 101);

        g.setColor(Color.MAGENTA);
        g.fillOval(240, 160, 221, 101);
        g.setColor(Color.BLACK);

        g.setColor(Color.MAGENTA);
        g.fillArc(470, 30, 221, 101, 0, 45);
        g.setColor(Color.BLACK);
        g.drawOval(470, 30, 221, 101);

        g.drawOval(530, 160, 101, 101);


        g.drawString("Lijn", 101, 35);
        g.drawString("Rechthoek", 91, 155);
        g.drawString("Afgeronde rechthoek", 60, 275);
        g.drawString("Gevulde rechthoek met ovaal", 271, 155);
        g.drawString("Gevulde ovaal", 301, 275);
        g.drawString("Taartpunt met ovaal er omheen", 500, 155);
        g.drawString("Cirkel", 566, 275);
    }
}

