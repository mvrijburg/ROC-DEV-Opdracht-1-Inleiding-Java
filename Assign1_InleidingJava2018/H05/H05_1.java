package Assign1_InleidingJava2018.H05;

import java.applet.*;
import java.awt.*;

public class H05_1 extends Applet {

    Color fill_color;
    Color line_color;
    int width;
    int height;

    public void init() {
        setSize(720, 480);
        setBackground(Color.WHITE);

        fill_color = Color.MAGENTA;
        line_color = Color.BLACK;
        width = 221;
        height = 101;
    }
    public void paint(Graphics g) {
        g.drawLine(10, 20, 231, 20);

        g.drawRect(10, 40, width, height);

        g.drawRoundRect(10, 160, width, height, 30, 30);

        g.setColor(fill_color);
        g.fillRect(240, 40, width, height);
        g.setColor(line_color);
        g.drawOval(240, 40, width, height);

        g.setColor(fill_color);
        g.fillOval(240, 160, width, height);
        g.setColor(line_color);

        g.setColor(fill_color);
        g.fillArc(470, 30, width, height, 0, 45);
        g.setColor(line_color);
        g.drawOval(470, 30, width, height);

        g.drawOval(530, 160, width, height);


        g.drawString("Lijn", 101, 35);
        g.drawString("Rechthoek", 91, 155);
        g.drawString("Afgeronde rechthoek", 60, 275);
        g.drawString("Gevulde rechthoek met ovaal", 271, 155);
        g.drawString("Gevulde ovaal", 301, 275);
        g.drawString("Taartpunt met ovaal er omheen", 500, 155);
        g.drawString("Cirkel", 566, 275);
    }
}