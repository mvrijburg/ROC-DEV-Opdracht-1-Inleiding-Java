package Assign1_InleidingJava2018.H04;

import java.awt.*;
import java.applet.*;

public class H04_4 extends Applet {
    /** opdracht
     *      Drie kinderen hebben het volgende gewicht:
     *
     *          Valerie: 40 kg
     *          Jeroen: 100 kg
     *          Hans: 80 kg
     *      Maak van deze gegevens een staafdiagram, waarbij elke kolom een eigen kleur heeft.
     *      De namen van de kinderen staan onder het staafdiagram en de verdeling van de schaal
     *      staat naast de diagram met daarbij om de 20 de verdeling.
     */

    public void init() {
        setSize(800, 800);
    }


    public void paint(Graphics g) {
        // graph
        setBackground(Color.WHITE);
        g.drawLine( 200, 100, 200, 600);
        g.drawLine(200, 600, 550, 600);

        g.drawString("Personen", 555, 607);
        g.drawString("Gewicht (KG)", 125, 80);

        g.drawString("100kg", 162, 100);
        g.drawString("  80kg", 162, 200);
        g.drawString("  60kg", 162, 300);
        g.drawString("  40kg", 162, 400);
        g.drawString("  20kg", 162, 500);
        g.drawString("    0kg", 162, 600);

        g.drawString("Valerie", 250, 615);
        g.drawString("Jeroen", 355, 615);
        g.drawString("Hans", 460, 615);

        // 100px = 20kg
        g.setColor(Color.RED);
        g.fillRect(250, 400, 50, 200);

        g.setColor(Color.BLUE);
        g.fillRect(350, 100, 50, 500);

        g.setColor(Color.ORANGE);
        g.fillRect(450, 200, 50, 400);

        g.setColor(Color.BLACK);
        g.drawRect(250, 400, 50, 200);
        g.drawRect(350, 100, 50, 500);
        g.drawRect(450, 200, 50, 400);
    }

}
